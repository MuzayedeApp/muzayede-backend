package com.cengo.muzayedebackend.exception;

import com.cengo.muzayedebackend.errormessage.BaseErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends BaseException {

	public ItemNotFoundException(BaseErrorMessage baseErrorMessage) {
		super(baseErrorMessage);
	}
}
