package com.mangvientrieu.notification.storage.repository;

import com.mangvientrieu.notification.storage.entity.StoredNotificationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface NotificationRepository extends JpaRepository<StoredNotificationEntity, String> {
	@Query("select n " +
			"from StoredNotificationEntity n " +
			"where n.userId = :userId " +
			"and (n.deleted is null or n.deleted <> true)")
	Page<StoredNotificationEntity> findAvailableByUserId(String userId, Pageable pageable);

	@Query("select count(n.id) " +
			"from StoredNotificationEntity n " +
			"where n.userId = :userId " +
			"and (n.read is null or n.read <> true) " +
			"and (n.deleted is null or n.deleted <> true)")
	Long countUnreadByUserId(String userId);

	@Modifying
	@Transactional
	@Query("update StoredNotificationEntity " +
			"set read = true " +
			"where userId = :userId")
	void updateReadByUserId(String userId);
}
