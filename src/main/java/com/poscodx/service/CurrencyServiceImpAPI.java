package com.poscodx.service;

import com.poscodx.dto.CurrencyDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.cfg.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpAPI implements CurrencyServiceAPI{
    private final RestTemplate restTemplate;

    @Value("${currencyLayer.url}")
    private String url;

    @Value("${currencyLayer.key}")
    private String key;

    private CurrencyDTO currencyDTO;

    @Override
    public CurrencyDTO getCurrencyDTO(){
        currencyDTO = restTemplate.getForObject(url+key, CurrencyDTO.class);
        return currencyDTO;
    }

}
