package com.example.publicApiClient.controller;

import com.example.publicApiClient.response.LabelResponse;
import com.example.publicApiClient.response.NumberResponse;
import com.example.publicApiClient.services.ApiServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/v1")
@RequiredArgsConstructor
public class ApiController {
    private final ApiServices apiServices;

    @GetMapping("getParcelNumber")
    @ResponseStatus(HttpStatus.OK)
    public NumberResponse getRandomNumber() {
        return apiServices.getNumberRandom();
    }

    @GetMapping("getLabel/{number}")
    @ResponseStatus(HttpStatus.OK)
    public LabelResponse getRandomUuid(@PathVariable Integer number) {
        return apiServices.getRandomUuid();

    }
}