package com.mangvientrieu.notification.template.annotation;

import com.mangvientrieu.notification.template.config.NotificationTemplateSelector;
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
@Import(NotificationTemplateSelector.class)
public @interface EnableNotificationTemplate {
}
