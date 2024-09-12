package com.mangvientrieu.notification.storage.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
public class PushNotificationTopicRequest implements Serializable {
	private static final long serialVersionUID = -7627038285563394661L;

	private String fcmTopic;
	private String title;
	private String shortDescription;
	private String fullDescription;
	private Map<String, String> data;

}
