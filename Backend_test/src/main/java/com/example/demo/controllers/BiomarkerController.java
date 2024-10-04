package com.example.demo.controllers;

import com.example.demo.DTOs.Biomarker;
import com.example.demo.services.BiomarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/biomarkers")
public class BiomarkerController {

    @Autowired
    private BiomarkerService biomarkerService;

    @GetMapping("/")
    public ResponseEntity<List<Biomarker>> getBiomarkers(
            @RequestParam(required = false) List<String> categories,
            @RequestParam(required = false) List<String> types,
            @RequestParam(required = false) String startDateTime,
            @RequestParam(required = false) String endDateTime
    ) {
        return biomarkerService.getBiomarkers(categories, types, startDateTime, endDateTime);
    }
}
