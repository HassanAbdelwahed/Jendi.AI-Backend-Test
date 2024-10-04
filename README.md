# Jendi.AI-Backend-Test

## Documentation

---

## API

### To Test the API:

**Endpoint**:  
`GET https://backendtest-latest-0yny.onrender.com/api/biomarkers`

Use this endpoint to retrieve biomarker data from the API.

### Parameters

| Parameter       | Type                | Required | Description                                                                   |
| --------------- | ------------------- | -------- | ----------------------------------------------------------------------------- |
| `types`         | Array of strings     | No       | Specifies the biomarker type (e.g., `steps`, `heart_rate`).                    |
| `categories`    | Array of strings     | Yes      | Classifies the biomarker into a category (e.g., `activity`, `sleep`).          |
| `startDateTime` | string `<date-time>` | No       | The starting timestamp for the period over which the biomarker was calculated. |
| `endDateTime`   | string `<date-time>` | No       | The ending timestamp for the specified period.                                 |

### Example Request:

To make a request to the API, use the following example:

```bash
curl -X GET "https://backendtest-latest-0yny.onrender.com/api/biomarkers?categories=activity&types=steps&startDateTime=2024-10-01T00:00:00Z&endDateTime=2024-10-03T23:59:59Z"
