package com.kaminich.productmanagement.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private HttpStatus status;
    private String message;
    private T data;
    private boolean success = true;
    private final LocalDateTime timestamp = LocalDateTime.now();

    public ApiResponse(HttpStatus status, String message, T data, boolean success) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public ApiResponse(HttpStatus status, boolean success, String message) {
        this(status, message, null, success);
    }

    // Overloaded constructor for default success
    public ApiResponse(HttpStatus status, String message, T data) {
        this(status, message, data, true);
    }

    // Overloaded constructor for default success and no data
    public ApiResponse(HttpStatus status, String message) {
        this(status, message, null, true);
    }
}
