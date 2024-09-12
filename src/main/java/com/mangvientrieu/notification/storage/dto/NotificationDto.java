package com.mangvientrieu.notification.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
public class NotificationDto implements Serializable {
	private static final long serialVersionUID = -3543856426086741312L;

	private Long id;
	private String userId;
	private String title;
	private String shortDescription;
	private String fullDescription;
	private Boolean read;
	private Date createdDate;
	private Date updatedDate;

}
