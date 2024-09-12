package com.mangvientrieu.notification.delivery.service;

import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.mangvientrieu.notification.delivery.entity.FCMDeviceEntity;
import com.mangvientrieu.notification.delivery.payload.request.PushNotificationRequest;
import com.mangvientrieu.notification.delivery.payload.request.PushNotificationTopicRequest;
import com.mangvientrieu.notification.delivery.repository.FCMDeviceRepository;
import org.apache.commons.lang3.StringUtils;

/**
 * The interface Push notification service.
 *
 * @author mangvientrieu
 */
public interface PushNotificationService {
	/**
	 * Push notification.
	 *
	 * @param input the input
	 */
	void pushNotification(PushNotificationRequest input);

	/**
	 * Push notification topic.
	 *
	 * @param input the input
	 */
	void pushNotificationTopic(PushNotificationTopicRequest input);

	/**
	 * Build message.
	 *
	 * @param input the input
	 * @return the message
	 */
	default Message buildMessage(PushNotificationRequest input) {
		String fcmToken;
		String userId = input.getUserId();
		if (StringUtils.isNotBlank(userId)) {
			fcmToken = getFcmDeviceRepository().findByUserIdAndActivatedIsTrue(userId)
					.map(FCMDeviceEntity::getFcmToken)
					.orElse(null);
		} else {
			fcmToken = getFcmDeviceRepository().findByDeviceId(input.getDeviceId())
					.map(FCMDeviceEntity::getFcmToken)
					.orElse(null);
		}

		return Message.builder()
				.setToken(fcmToken)
				.setNotification(Notification.builder()
						.setTitle(input.getTitle())
						.setBody(input.getShortDescription())
						.build())
				.putAllData(input.getData())
				.build();
	}

	/**
	 * Build topic message.
	 *
	 * @param input the input
	 * @return the message
	 */
	default Message buildTopicMessage(PushNotificationTopicRequest input) {
		return Message.builder()
				.setTopic(input.getFcmTopic())
				.setNotification(Notification.builder()
						.setTitle(input.getTitle())
						.setBody(input.getShortDescription())
						.build())
				.build();
	}

	FCMDeviceRepository getFcmDeviceRepository();
}
