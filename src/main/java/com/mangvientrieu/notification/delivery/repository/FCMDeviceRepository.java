package com.mangvientrieu.notification.delivery.repository;

import com.mangvientrieu.notification.delivery.entity.FCMDeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface FCMDeviceRepository extends JpaRepository<FCMDeviceEntity, Long> {
	Optional<FCMDeviceEntity> findByDeviceId(String deviceId);

	Optional<FCMDeviceEntity> findByUserIdAndActivatedIsTrue(String userId);

	@Transactional
	@Modifying
	@Query("update FCMDeviceEntity " +
			"set activated = false " +
			"where userId = :userId")
	void updateInactiveAllOfUser(String userId);
}
