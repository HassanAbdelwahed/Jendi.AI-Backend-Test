package com.example.demo.helpers;

import com.example.demo.DTOs.AccountTokenRequestBody;
import com.example.demo.DTOs.AccountTokenResponse;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Util {
    public static AccountTokenResponse getAccountToken(String clientId, String clientSecret) {
        String url = "https://sandbox-api.sahha.ai/api/v1/oauth/account/token";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        AccountTokenRequestBody requestBody = AccountTokenRequestBody.builder()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .build();

        HttpEntity<AccountTokenRequestBody> requestEntity = new HttpEntity<>(requestBody, headers);

        // Make the post request
        ResponseEntity<AccountTokenResponse> response = restTemplate.postForEntity(
                url,
                requestEntity,
                AccountTokenResponse.class
        );

        if (response.getStatusCode() != HttpStatus.OK || response.getBody() == null) {
            return null;
        }
        return response.getBody();
    }
}
