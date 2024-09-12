package com.mangvientrieu.notification.delivery.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
public class PushNotificationRequest implements Serializable {
	@Serial
	private static final long serialVersionUID = -7627038285563394661L;

	private String userId;
	private String deviceId;
	private String title;
	private String shortDescription;
	private String fullDescription;
	private Map<String, String> data;

}
