package com.example.publicApiClient.services;

import com.example.publicApiClient.response.LabelResponse;
import com.example.publicApiClient.response.NumberResponse;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class ApiServices {
    public NumberResponse getNumberRandom() {
        Random random = new Random();
        int ran = random.nextInt(122121212);
        return new NumberResponse(ran);
    }

    public LabelResponse getRandomUuid(){
        UUID uuid = UUID.randomUUID();
        return new LabelResponse(uuid);
    }
}
