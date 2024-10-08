package com.mangvientrieu.notification.delivery.service;

import com.mangvientrieu.notification.delivery.payload.request.RegisterFCMRequest;
import com.mangvientrieu.notification.delivery.payload.request.RegisterUserDeviceRequest;

import java.util.List;

/**
 * @author mangvientrieu
 */
public interface FCMService {
	Boolean registerFCM(RegisterFCMRequest request);

	Boolean registerUserDevice(RegisterUserDeviceRequest request);

	List<String> getListTopic(String groupId);

}
