package com.liverton.app.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liverton.app.model.Market;
import com.liverton.app.service.CurrencyService;
import com.liverton.app.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements CurrencyService {


    @Value("${cryptingup.api.url}")
    private String apiUrl;

    @Override
    public Market getCurrencyData() throws JsonProcessingException {
        String jsonString = HttpClientUtils.get(apiUrl, null);

        Market market = new ObjectMapper().readValue(jsonString, Market.class);
        return market;
    }
}
