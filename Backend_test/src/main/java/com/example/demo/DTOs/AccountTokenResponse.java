package com.example.demo.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccountTokenResponse {

    private String accountToken;
    private String tokenType;
}
