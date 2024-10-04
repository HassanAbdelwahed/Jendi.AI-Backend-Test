package com.example.demo.DTOs;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AccountTokenRequestBody {
    private String clientId;
    
    private String clientSecret;
    
//    {
//        "clientId": "12Ch2mfWwgZJdb1hFao7p1sx8xm2GPxA",
//            "clientSecret": "a1QB23452qr7z2SX9Cieod5plwSjxu2l4tUjhBpZfE4eDWIhciOqn2jY22UGvWQj"
//    }
}
