package com.example.demo.services;

import com.example.demo.DTOs.AccountTokenResponse;
import com.example.demo.DTOs.Biomarker;
import com.example.demo.helpers.Util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@Service
public class BiomarkerService {

    public ResponseEntity<List<Biomarker>> getBiomarkers(List<String> categories, List<String> types, String startDateTime, String endDateTime) throws JsonProcessingException {
        String clientId = "XhobMe05wLBRpx1gsraL6m5a6AV2KGTp";
        String clientSecret = "N7BMIWPHA93Pf86gszSYLnkDJactjSZ2hGLNSxiClJM69WB48x5Zr0g3NQeMLCHz";
        String externalId = "jdjcjcndncsjjrcnjjsaxnncjj";
        String url = "https://sandbox-api.sahha.ai/api/v1/profile/biomarker/" + externalId;

        AccountTokenResponse accountTokenResponse = Util.getAccountToken(clientId, clientSecret);
        if (accountTokenResponse == null || accountTokenResponse.getAccountToken() == null) {
            return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
        }

        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url);
        for (String category : categories) {
            uriBuilder = uriBuilder.queryParam("categories", category);
        }

        if (types != null && !types.isEmpty()) {
            for (String type : types) {
                uriBuilder = uriBuilder.queryParam("types", type);
            }
        }

        if (startDateTime != null && !startDateTime.isEmpty())
            uriBuilder = uriBuilder.queryParam("startDateTime", startDateTime);
        if (endDateTime != null && !endDateTime.isEmpty())
            uriBuilder = uriBuilder.queryParam("endDateTime", endDateTime);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "account " + accountTokenResponse.getAccountToken());

        ResponseEntity<String> response = restTemplate.exchange(
                uriBuilder.toUriString(),
                HttpMethod.GET,
                new HttpEntity<>(headers),
                String.class
        );
        ObjectMapper objectMapper = new ObjectMapper();
        List<Biomarker> biomarkers = objectMapper.readValue(response.getBody(), new TypeReference<List<Biomarker>>() {});

        return new ResponseEntity<>(biomarkers, HttpStatus.OK);
    }
}
