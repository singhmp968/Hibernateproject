package com.jpa.test.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{
public ResourceNotFoundException(String nessage) {
	super(nessage);
}

public ResourceNotFoundException(String nessage,Throwable th) {
	super(nessage,th);
}


}


