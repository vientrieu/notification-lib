package com.mangvientrieu.notification.delivery.config;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mangvientrieu
 */

@Configuration
@AutoConfigurationPackage(basePackages = "com.mangvientrieu.notification.delivery")
@ComponentScan({
		"com.mangvientrieu.notification.common",
		"com.mangvientrieu.notification.delivery",
})
public class NotificationDeliverySelector {
}
