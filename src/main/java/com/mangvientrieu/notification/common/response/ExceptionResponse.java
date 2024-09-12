package com.mangvientrieu.notification.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author mangvientrieu
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse implements Serializable {
	@Serial
	private static final long serialVersionUID = 2079998569683366497L;

	private String errorCode;
	private String errorMessage;
}
