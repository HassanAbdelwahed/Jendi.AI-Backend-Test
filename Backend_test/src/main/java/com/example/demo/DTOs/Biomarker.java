package com.example.demo.DTOs;

import java.time.LocalDateTime;

public class Biomarker {

    private String category;
    private String type;
    private String periodicity;
    private String aggregation;
    private String value;
    private String unit;
    private String valueType;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    // Constructors
    public Biomarker() {}

    public Biomarker(String category, String type, String periodicity, String aggregation, String value, String unit, String valueType, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.category = category;
        this.type = type;
        this.periodicity = periodicity;
        this.aggregation = aggregation;
        this.value = value;
        this.unit = unit;
        this.valueType = valueType;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    // Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getAggregation() {
        return aggregation;
    }

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return "Biomarker{" +
                "category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", periodicity='" + periodicity + '\'' +
                ", aggregation='" + aggregation + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                ", valueType='" + valueType + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                '}';
    }
}
