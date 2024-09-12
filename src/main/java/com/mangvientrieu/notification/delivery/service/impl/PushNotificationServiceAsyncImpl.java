package com.mangvientrieu.notification.delivery.service.impl;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.mangvientrieu.notification.delivery.payload.request.PushNotificationRequest;
import com.mangvientrieu.notification.delivery.payload.request.PushNotificationTopicRequest;
import com.mangvientrieu.notification.delivery.repository.FCMDeviceRepository;
import com.mangvientrieu.notification.delivery.service.PushNotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author mangvientrieu
 */
@Slf4j
@Service("pushNotificationServiceAsync")
@RequiredArgsConstructor
public class PushNotificationServiceAsyncImpl implements PushNotificationService {
	private final FCMDeviceRepository fcmDeviceRepository;
	private final FirebaseMessaging firebaseMessaging;

	@Override
	public void pushNotification(PushNotificationRequest input) {
		Message message = buildMessage(input);
		firebaseMessaging.sendAsync(message);
	}

	@Override
	public void pushNotificationTopic(PushNotificationTopicRequest input) {
		Message message = Message.builder()
				.setTopic(input.getFcmTopic())
				.setNotification(Notification.builder()
						.setTitle(input.getTitle())
						.setBody(input.getShortDescription())
						.build())
				.build();
		firebaseMessaging.sendAsync(message);
	}

	@Override
	public FCMDeviceRepository getFcmDeviceRepository() {
		return fcmDeviceRepository;
	}

}
