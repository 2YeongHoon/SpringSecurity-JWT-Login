package com.jwt.auth.jwtpractice.exception;

public abstract class BasicResponse {
    private int statusCode;
    private String message;
    private String path;
    private String method;
    private String timestamp;
    private int dataCount;
}
