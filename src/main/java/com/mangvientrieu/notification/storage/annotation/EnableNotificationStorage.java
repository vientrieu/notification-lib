package com.mangvientrieu.notification.storage.annotation;

import com.mangvientrieu.notification.storage.config.NotificationStorageSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mangvientrieu
 */


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(NotificationStorageSelector.class)
public @interface EnableNotificationStorage {
}
