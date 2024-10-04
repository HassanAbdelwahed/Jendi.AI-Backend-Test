# Jendi.AI-Backend-Test

## Documentation

---

## API 

### To Test the API: 
The application is hosted on Render. You can also run the server locally or using Docker.

**Endpoint**:  
`GET https://backendtest-latest-0yny.onrender.com/api/biomarkers`

Use this endpoint to retrieve biomarker data from the API.

### Parameters

| Parameter       | Type                | Required | Description                                                                   |
| --------------- | ------------------- | -------- | ----------------------------------------------------------------------------- |
| `categories`    | Array of strings     | Yes      | Classifies the biomarker into a category (e.g., `activity`, `sleep`).          |
| `types`         | Array of strings     | No       | Specifies the biomarker type (e.g., `steps`, `heart_rate`).                    |
| `startDateTime` | string `<date-time>` | No       | The starting timestamp for the period over which the biomarker was calculated. |
| `endDateTime`   | string `<date-time>` | No       | The ending timestamp for the specified period.                                 |

### Example Request:

To make a request to the API, use the following example:

```bash
curl -X GET "https://backendtest-latest-0yny.onrender.com/api/biomarkers?categories=sleep"
```

## Response

```json
[
    {
        "category": "sleep",
        "type": "sleep_mid_time",
        "periodicity": "daily",
        "aggregation": "none",
        "value": "2024-09-28T01:46:30+00:00",
        "unit": "datetime",
        "valueType": "datetime",
        "startDateTime": "2024-09-27T18:00:00+00:00",
        "endDateTime": "2024-09-28T17:59:59+00:00"
    }
]
