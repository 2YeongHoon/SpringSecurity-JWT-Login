package com.jwt.auth.jwtpractice.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class TimeStemp {

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyyMMddHHmmss")
    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    public LocalDateTime startDate;
}
