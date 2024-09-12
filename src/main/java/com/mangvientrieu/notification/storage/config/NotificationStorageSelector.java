package com.mangvientrieu.notification.storage.config;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mangvientrieu
 */

@Configuration
@AutoConfigurationPackage(basePackages = "com.mangvientrieu.notification.storage")
@ComponentScan({
		"com.mangvientrieu.notification.common",
		"com.mangvientrieu.notification.storage",
})
public class NotificationStorageSelector {
}
