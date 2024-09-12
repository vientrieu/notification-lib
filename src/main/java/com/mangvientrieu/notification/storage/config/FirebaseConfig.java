//package com.mangvientrieu.notification.storage.config;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.messaging.FirebaseMessaging;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//import java.io.IOException;
//import java.io.InputStream;
//
///**
// * @author mangvientrieu
// */
//@Slf4j
//@Configuration
//public class FirebaseConfig {
//	@Value("${firebase.json}")
//	private String firebaseJson;
//
//	@Bean
//	GoogleCredentials googleCredentials() throws IOException {
//		Resource resource = new ClassPathResource(firebaseJson);
//		InputStream is = resource.getInputStream();
//
//		return GoogleCredentials.fromStream(is);
//	}
//
//	@Bean
//	FirebaseApp firebaseApp(GoogleCredentials credentials) {
//		FirebaseOptions options = FirebaseOptions.builder()
//				.setCredentials(credentials)
//				.build();
//
//		return FirebaseApp.initializeApp(options);
//	}
//
//	@Bean
//	FirebaseMessaging firebaseMessaging(FirebaseApp firebaseApp) {
//		return FirebaseMessaging.getInstance(firebaseApp);
//	}
//
//}
