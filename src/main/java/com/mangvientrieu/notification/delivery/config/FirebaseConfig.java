package com.mangvientrieu.notification.delivery.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mangvientrieu.notification.common.config.NotificationConfigProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author mangvientrieu
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class FirebaseConfig {
	private final NotificationConfigProperties notificationConfigProperties;

	@Bean
	GoogleCredentials googleCredentials() throws IOException {
		Resource resource = new ClassPathResource(
				notificationConfigProperties.getDelivery().getFirebase().getCredential()
		);
		InputStream is = resource.getInputStream();

		return GoogleCredentials.fromStream(is);
	}

	@Bean
	FirebaseApp firebaseApp(GoogleCredentials credentials) {
		FirebaseOptions options = FirebaseOptions.builder()
				.setCredentials(credentials)
				.build();
		log.info("Firebase options: {}", options);
		return FirebaseApp.initializeApp(options);
	}

	@Bean
	FirebaseMessaging firebaseMessaging(FirebaseApp firebaseApp) {
		return FirebaseMessaging.getInstance(firebaseApp);
	}

}
