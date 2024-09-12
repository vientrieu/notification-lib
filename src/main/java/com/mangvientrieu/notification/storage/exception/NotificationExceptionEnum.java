package com.mangvientrieu.notification.storage.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author mangvientrieu
 */
@Getter
@AllArgsConstructor
public enum NotificationExceptionEnum {
	DEVICE_NOT_FOUND("DEVICE_NOT_FOUND", "Device not found"),
	;
	private final String code;
	private final String message;
}
