package com.example.publicApiClient.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class NumberResponse {
    Integer parcelNumber;
}