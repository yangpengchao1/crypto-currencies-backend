package com.liverton.app.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.liverton.app.entity.Result;
import com.liverton.app.entity.StatusCode;
import com.liverton.app.model.Market;
import com.liverton.app.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    /**
     * currency list data
     * @return
     */
    @GetMapping("/list")
    public Result<Market> findByParentId() throws JsonProcessingException {
        Market markets=currencyService.getCurrencyData();
        return new Result<Market>(true, StatusCode.OK, "SUCCESS", markets);
    }
}
