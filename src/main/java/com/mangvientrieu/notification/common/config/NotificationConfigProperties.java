package com.mangvientrieu.notification.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author mangvientrieu
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties
@PropertySource(value = "classpath:notification-config.yaml", factory = YamlPropertySourceFactory.class)
public class NotificationConfigProperties {
	private NotificationDeliveryProperties delivery = new NotificationDeliveryProperties();
	private NotificationStorageProperties storage = new NotificationStorageProperties();

	@Getter
	@Setter
	public static class NotificationDeliveryProperties {
		private boolean enabled = true;
		private FirebaseProperties firebase;

		@Getter
		@Setter
		public static class FirebaseProperties {
			private String credential;
		}
	}

	@Getter
	@Setter
	public static class NotificationStorageProperties {
		private boolean enabled = true;
	}
}
