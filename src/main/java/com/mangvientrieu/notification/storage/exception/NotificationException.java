package com.mangvientrieu.notification.storage.exception;

import lombok.Getter;

/**
 * @author mangvientrieu
 */
@Getter
public class NotificationException extends RuntimeException {
	private static final long serialVersionUID = -4694220879500310025L;
	private final String errorCode;
	private final String errorMsg;

	public NotificationException(String errorCode, String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public NotificationException(NotificationExceptionEnum exception) {
		super(exception.getMessage());
		this.errorCode = exception.getCode();
		this.errorMsg = exception.getMessage();
	}

}
