package com.addressRegistration.AddressRegistration.app.gen.exceptions;

import com.addressRegistration.AddressRegistration.app.gen.enums.GenErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(GenErrorMessage message) {
        super(message.getMessage());
    }
}