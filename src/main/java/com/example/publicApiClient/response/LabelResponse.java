package com.example.publicApiClient.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class LabelResponse {
    private UUID labelNumber;
}