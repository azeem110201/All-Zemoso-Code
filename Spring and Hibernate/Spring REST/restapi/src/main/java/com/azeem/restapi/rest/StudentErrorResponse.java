package com.azeem.restapi.rest;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;
}
