package com.mangvientrieu.notification.storage.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 2079998569683366497L;

	private String errorCode;
	private String errorMessage;
}
