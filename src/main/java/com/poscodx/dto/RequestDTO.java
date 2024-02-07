package com.poscodx.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestDTO {

    @NotEmpty
    private String fromCurrency;

    @NotEmpty
    private String toCurrency;

    @Min(0) @Max(10)
    private int amount;
}
