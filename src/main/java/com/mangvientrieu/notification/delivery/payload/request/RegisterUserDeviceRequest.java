package com.mangvientrieu.notification.delivery.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
public class RegisterUserDeviceRequest implements Serializable {
	@Serial
	private static final long serialVersionUID = 470731800468837860L;

	@NotBlank
	private String userId;
	@NotBlank
	private String deviceId;
}
