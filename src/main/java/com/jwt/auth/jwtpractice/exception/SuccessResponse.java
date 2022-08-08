//package com.jwt.auth.jwtpractice.exception;
//
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.http.HttpStatus;
//
//import java.util.List;
//
//@Getter
//@Setter
//@Builder
//public class SuccessResponse<T> extends BasicResponse {
//
//    private HttpStatus statusCode;
//    private String message;
//    private String path;
//    private String method;
//    private String timestamp;
//    private int dataCount;
//    private T data;
//
////    public static SuccessResponseBuilder builder(T data, int statusCode, String method, String timestamp){
////        return new SuccessResponseBuilder();
////    }
//
//    public SuccessResponse(T data, HttpStatus statusCode, String method, String timestamp) {
//        this.statusCode = statusCode;
//        this.data = data;
//        this.message = "Success";
//        this.method = method;
//        this.timestamp = timestamp;
//
//        if(data instanceof List) {
//            this.dataCount = ((List<?>)data).size();
//        } else {
//            this.dataCount = 1;
//        }
//    }
//}
