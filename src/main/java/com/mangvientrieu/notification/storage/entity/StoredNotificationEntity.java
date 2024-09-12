package com.mangvientrieu.notification.storage.entity;

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
@Table(name = "stored_notification", indexes = {
		@Index(name = "idx_notification_user_id", columnList = "user_id")
})
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoredNotificationEntity extends AbstractEntity {

	@Column(name = "user_id")
	private String userId;

	@Column(name = "title")
	private String title;

	@Column(name = "short_description")
	private String shortDescription;

	@Column(name = "full_description", columnDefinition = "text")
	private String fullDescription;

	@Column(name = "is_read")
	private Boolean read;

	@Column(name = "deleted")
	private Boolean deleted;

}
