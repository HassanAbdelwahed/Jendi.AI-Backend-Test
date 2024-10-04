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
```

## To run the Application locally:

# Install Docker

## To run the Application using Docker:

# Install Docker

1- Check the official [Docker documentation](https://docs.docker.com/engine/) for information how to install Docker on your operating system. And then install Docker and supporting tools.

2- Pull image hassanabdelwahed/backendtest:latest from Docker Hub:
```bash
docker pull hassanabdelwahed/backendtest:latest
```

3- Run Container from Image
```bash
docker run -p 8080:8080 hassanabdelwahed/backendtest
```
4- test the Api from postman using Endpoint
```bash
http://localhost:8080/api/biomarkers?categories=sleep
```

## What You Need

To get started, you will need the following:

- A favorite text editor or IDE
- [Java 17](https://www.oracle.com/java/technologies/downloads/) or later
- [Maven 3.5+](https://maven.apache.org/download.cgi)

You can also import the code straight into your IDE:
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
---

# Clone the Project

To clone this project, use the following Git command:
```bash
[git clone https://github.com/spring-guides/gs-spring-boot.git](https://github.com/HassanAbdelwahed/Jendi.AI-Backend-Test.git)


