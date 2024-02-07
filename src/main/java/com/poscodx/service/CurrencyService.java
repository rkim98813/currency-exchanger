package com.poscodx.service;

import com.poscodx.dto.CurrencyDTO;
import com.poscodx.entity.ExchangeRateEntity;
import com.poscodx.repository.ExchangeRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CurrencyService {
    private final CurrencyServiceAPI currencyServiceAPI;

    private final ExchangeRateRepository exchangeRateRepository;


    public Double getExchangeRate(String fromCurrency, String toCurrency){
        CurrencyDTO currencyDTO = currencyServiceAPI.getCurrencyDTO();
        Double exchangeRate = currencyDTO.getQuotes().get(fromCurrency+toCurrency);

        // Save exchange rate information to the database
        saveExchangeRateToDatabase(fromCurrency, toCurrency, exchangeRate);

        return exchangeRate;
    }

    private void saveExchangeRateToDatabase(String fromCurrency, String toCurrency, Double exchangeRate) {
        ExchangeRateEntity exchangeRateEntity = new ExchangeRateEntity();
        exchangeRateEntity.setFromCurr(fromCurrency);
        exchangeRateEntity.setToCurr(toCurrency);
        exchangeRateEntity.setRateDate(LocalDate.now().toString());
        exchangeRateEntity.setExchangeRate(exchangeRate.floatValue());
        exchangeRateEntity.setRateType("TTM");

        exchangeRateRepository.save(exchangeRateEntity);
    }


}
