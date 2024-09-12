//package com.mangvientrieu.notification.storage.service.impl;
//
//import com.fozito.notificationlib.entity.FCMDeviceEntity;
//import com.fozito.notificationlib.entity.FCMTopicEntity;
//import com.fozito.notificationlib.exception.NotificationException;
//import com.fozito.notificationlib.exception.NotificationExceptionEnum;
//import com.fozito.notificationlib.payload.request.RegisterFCMRequest;
//import com.fozito.notificationlib.payload.request.RegisterUserDeviceRequest;
//import com.fozito.notificationlib.repository.FCMDeviceRepository;
//import com.fozito.notificationlib.repository.FCMTopicRepository;
//import com.fozito.notificationlib.service.FCMService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author mangvientrieu
// */
//@Service
//@RequiredArgsConstructor
//public class FCMServiceImpl implements FCMService {
//	private final FCMDeviceRepository fcmDeviceRepository;
//	private final FCMTopicRepository fcmTopicRepository;
//
//	@Override
//	public Boolean registerFCM(RegisterFCMRequest request) {
//		String deviceId = request.getDeviceId();
//		FCMDeviceEntity fcmDeviceEntity = fcmDeviceRepository.findByDeviceId(deviceId)
//				.orElseGet(() -> FCMDeviceEntity.builder()
//						.deviceId(deviceId)
//						.build());
//		fcmDeviceEntity.setFcmToken(request.getFcmToken());
//		fcmDeviceRepository.save(fcmDeviceEntity);
//
//		return true;
//	}
//
//	@Override
//	public Boolean registerUserDevice(RegisterUserDeviceRequest request) {
//		String deviceId = request.getDeviceId();
//		String userId = request.getUserId();
//		fcmDeviceRepository.updateInactiveAllOfUser(userId);
//		FCMDeviceEntity fcmDeviceEntity = fcmDeviceRepository.findByDeviceId(deviceId)
//				.orElseThrow(() -> new NotificationException(NotificationExceptionEnum.DEVICE_NOT_FOUND));
//		fcmDeviceEntity.setUserId(userId);
//		fcmDeviceEntity.setActivated(true);
//		fcmDeviceRepository.save(fcmDeviceEntity);
//
//		return true;
//	}
//
//	@Override
//	public List<String> getListTopic(String groupId) {
//		return fcmTopicRepository.findByGroupId(groupId).stream()
//				.map(FCMTopicEntity::getTopic)
//				.collect(Collectors.toList());
//	}
//}
