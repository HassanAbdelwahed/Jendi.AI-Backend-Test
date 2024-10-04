# Jendi.AI-Backend-Test

# API Microservice Documentation

## Overview

This microservice provides access to various campaigns through the API. All API requests require authentication using an API key. You can generate or find your API key by navigating to the `/settings` endpoint or clicking the "Settings" sidebar item in the dashboard.

---

## Api

To Test API:

id : A unique identifier for each biomarker reading.
type : Specifies the biomarker type (e.g., steps, heart_rate).
category : Classifies the biomarker into a category (e.g., activity, sleep).
value : The numerical value of the biomarker.
unit : The unit of measurement for the value.
periodicity : The frequency at which the biomarker data is generated (e.g., daily, weekly, intraday).
aggregation : The method of data aggregation used to calculate the value (e.g., total, average, maximum).
startDateTime : 
endDateTime :


```bash
GET https://backendtest-latest-0yny.onrender.com/api/biomarkers

categories	

types	
Array of strings
startDateTime	

endDateTime	


### Parameters

| Parameter | Type   | Required | Description                                      |
| --------- | ------ | -------- | ------------------------------------------------ |
| `types` | Array of strings | No      | Specifies the biomarker type (e.g., steps, heart_rate).    |
| `categories`      | Array of strings    | Yes       | Classifies the biomarker into a category (e.g., activity, sleep).     |
| `startDateTime` | string <date-time>    | No       | The starting timestamp for the period over which the biomarker was calculated. |
| `endDateTime`  | string <date-time>    | No       | The ending timestamp for that period.  |


