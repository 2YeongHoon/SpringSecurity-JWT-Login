package com.jwt.auth.jwtpractice.controller;

import com.jwt.auth.jwtpractice.dto.LoginDto;
import com.jwt.auth.jwtpractice.exception.TestResponse;
import com.jwt.auth.jwtpractice.exception.TimeStemp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public ResponseEntity<Object> hello(){

        List<LoginDto> loginDtoList = new ArrayList<>();
        TimeStemp timeStemp = new TimeStemp();

        LoginDto loginDto1 = LoginDto.builder()
                .username("123")
                .password("123")
                .build();

        LoginDto loginDto2 = LoginDto.builder()
                .username("345")
                .password("345")
                .build();

        loginDtoList.add(loginDto1);
        loginDtoList.add(loginDto2);


        TestResponse testResponse = TestResponse.builder()
                .statusCode(HttpStatus.OK.value())
                .httpStatus(HttpStatus.OK)
                .path("/hello")
                .method("GET")
                .timestamp(timeStemp.startDate)
                .data(Arrays.asList(loginDtoList))
                .dataCount(loginDtoList.size()).build();

        return new ResponseEntity<>(testResponse, testResponse.getHttpStatus());
    }
}
