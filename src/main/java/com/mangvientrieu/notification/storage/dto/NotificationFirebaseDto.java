package com.mangvientrieu.notification.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
public class NotificationFirebaseDto implements Serializable {
	private static final long serialVersionUID = 2215223169598745768L;

	private String subject;
	private String content;
	private String image;
	private Map<String, String> data;
	private List<String> tokens;
}
