package com.mangvientrieu.notification.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "notification")
public class NotificationStrategyConfig {
	private boolean enableStorage = true;
	private boolean enableDelivery = true;
}
