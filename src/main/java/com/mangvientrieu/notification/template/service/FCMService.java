package com.mangvientrieu.notification.template.service;

import com.mangvientrieu.notification.storage.payload.request.RegisterFCMRequest;
import com.mangvientrieu.notification.storage.payload.request.RegisterUserDeviceRequest;

import java.util.List;

/**
 * @author mangvientrieu
 */
public interface FCMService {
	Boolean registerFCM(RegisterFCMRequest request);

	Boolean registerUserDevice(RegisterUserDeviceRequest request);

	List<String> getListTopic(String groupId);

}
