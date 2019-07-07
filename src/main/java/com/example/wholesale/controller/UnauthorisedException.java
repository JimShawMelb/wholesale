package com.example.wholesale.controller;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class UnauthorisedException extends RuntimeException {
    private static final long serialVersionUID = 5451823461535291948L;
}
