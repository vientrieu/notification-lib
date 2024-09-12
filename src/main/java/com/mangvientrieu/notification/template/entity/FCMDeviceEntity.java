package com.mangvientrieu.notification.template.entity;

import com.mangvientrieu.notification.common.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
@Entity
@Table(name = "fcm_device", indexes = {
		@Index(name = "idx_fcm_device_user_id", columnList = "user_id")
})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FCMDeviceEntity extends AbstractEntity {

	@Column(name = "user_id")
	private String userId;

	@Column(name = "device_id", unique = true, nullable = false)
	private String deviceId;

	@Column(name = "fcm_token")
	private String fcmToken;

	@Column(name = "activated")
	private Boolean activated;
}
