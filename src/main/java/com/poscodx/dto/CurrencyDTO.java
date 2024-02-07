package com.poscodx.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Getter
@Setter


@Component
public class CurrencyDTO {
    private Map<String, Double> quotes;
}
