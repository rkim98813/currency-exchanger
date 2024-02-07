package com.poscodx.controller;


import com.poscodx.dto.RequestDTO;
import com.poscodx.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CurrencyController {

    private final CurrencyService currencyService;


    @GetMapping("/exchange-rate")
    public ResponseEntity getExchangeRate(@Valid @ModelAttribute RequestDTO requestDTO) {
        Double exchangeRate = currencyService.getExchangeRate(requestDTO.getFromCurrency(), requestDTO.getToCurrency());

        return new ResponseEntity<>(exchangeRate, HttpStatus.OK);
    }
}
