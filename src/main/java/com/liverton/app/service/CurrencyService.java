package com.liverton.app.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.liverton.app.model.Market;

public interface CurrencyService {
    Market getCurrencyData() throws JsonProcessingException;
}
