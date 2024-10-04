# Jendi.AI-Backend-Test

# API Microservice Documentation

## Overview

This microservice provides access to various campaigns through the API. All API requests require authentication using an API key. You can generate or find your API key by navigating to the `/settings` endpoint or clicking the "Settings" sidebar item in the dashboard.

---

## Api

To Test API:

```bash
curl -H "Authorization: Bearer [YOUR_API_KEY]" https://your-api-url/api/campaigns/
