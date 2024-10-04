package com.example.demo.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Biomarker {

    private String category;
    private String type;
    private String periodicity;
    private String aggregation;
    private String value;
    private String unit;
    private String valueType;
    private String startDateTime;
    private String endDateTime;

}
