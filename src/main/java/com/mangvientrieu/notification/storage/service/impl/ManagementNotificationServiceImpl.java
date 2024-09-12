//package com.mangvientrieu.notification.storage.service.impl;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
///**
// * @author mangvientrieu
// */
//@Service
//@RequiredArgsConstructor
//public class ManagementNotificationServiceImpl implements ManagementNotificationService {
//	private final NotificationRepository notificationRepository;
//	private final NotificationMapper notificationMapper;
//
//	@Override
//	public Page<NotificationDto> getAll(String userId, int page, int size) {
//		return notificationRepository.findAvailableByUserId(userId,
//						PageRequest.of(page - 1, size, Sort.Direction.DESC, "createdDate", "id"))
//				.map(notificationMapper::mapToDto);
//	}
//
//	@Override
//	public Boolean read(Long id) {
//		notificationRepository.findById(id).ifPresent(entity -> {
//			entity.setRead(true);
//			notificationRepository.save(entity);
//		});
//
//		return true;
//	}
//
//	@Override
//	public Boolean save(NotificationDto dto) {
//		NotificationEntity entity = notificationMapper.mapToEntity(dto);
//		notificationRepository.save(entity);
//
//		return true;
//	}
//
//	@Override
//	public Boolean readAll(String userId) {
//		notificationRepository.updateReadByUserId(userId);
//
//		return true;
//	}
//
//	@Override
//	public Boolean delete(Long id) {
//		notificationRepository.findById(id).ifPresent(entity -> {
//			entity.setDeleted(true);
//			notificationRepository.save(entity);
//		});
//
//		return true;
//	}
//
//	@Override
//	public Long countUnread(String userId) {
//		return notificationRepository.countUnreadByUserId(userId);
//	}
//}
