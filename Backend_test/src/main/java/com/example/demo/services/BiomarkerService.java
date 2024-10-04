package com.example.demo.services;

import com.example.demo.DTOs.AccountTokenResponse;
import com.example.demo.DTOs.Biomarker;
import com.example.demo.helpers.Util;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@Service
public class BiomarkerService {

    @Value("${external_lId}")
    private String externalId;
    @Value("${client_ID}")
    private String clientId;
    @Value("${client_secret}")
    private String clientSecret;

    public ResponseEntity<List<Biomarker>> getBiomarkers(List<String> categories, List<String> types, String startDateTime, String endDateTime) {
        AccountTokenResponse accountTokenResponse = Util.getAccountToken(clientId, clientSecret);
        if (accountTokenResponse == null || accountTokenResponse.getAccountToken() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        String url = "https://sandbox-api.sahha.ai/api/v1/profile/biomarker/" + externalId;

        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url);
        if (categories != null)
            uriBuilder = uriBuilder.queryParam("categories", String.join(",", categories));
        if (types != null)
            uriBuilder = uriBuilder.queryParam("types", String.join(",", types));
        if (startDateTime != null)
            uriBuilder = uriBuilder.queryParam("startDateTime", startDateTime);
        if (endDateTime != null)
            uriBuilder = uriBuilder.queryParam("endDateTime", endDateTime);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "account " + accountTokenResponse.getAccountToken());

        // Make the POST request
        ResponseEntity<List<Biomarker>> response = restTemplate.exchange(
                uriBuilder.toUriString(),
                HttpMethod.GET,
                new HttpEntity<>(headers),
                new ParameterizedTypeReference<List<Biomarker>>() {}
        );
        System.out.println("getBioMarkers=>>>>>>>>>>>>>>>>>>>>>.");
        System.out.println(response.getBody());
        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }
}
