package com.jwt.auth.jwtpractice.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestResponse<T> {
    private int statusCode;
    private HttpStatus httpStatus;
    @Builder.Default private String message = "Success";
    private String path;
    private String method;
    private LocalDateTime timestamp;
    private int dataCount;
    private List<Object> data;
}
