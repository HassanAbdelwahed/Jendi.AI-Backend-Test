# Jendi.AI-Backend-Test

# Documentation

---

## Api

To Test API:

```bash
GET https://backendtest-latest-0yny.onrender.com/api/biomarkers

exit

### Parameters

| Parameter | Type   | Required | Description                                      |
| --------- | ------ | -------- | ------------------------------------------------ |
| `types` | Array of strings | No      | Specifies the biomarker type (e.g., steps, heart_rate).    |
| `categories`      | Array of strings    | Yes       | Classifies the biomarker into a category (e.g., activity, sleep).     |
| `startDateTime` | string <date-time>    | No       | The starting timestamp for the period over which the biomarker was calculated. |
| `endDateTime`  | string <date-time>    | No       | The ending timestamp for that period.  |


