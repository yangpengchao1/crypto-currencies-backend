package com.liverton.app.model;

import java.util.Date;

public class Currency {
    private String exchange_id;
    private String symbol;
    private String base_asset;
    private String quote_asset;
    private String price_unconverted;
    private String price;
    private String change_24h;
    private String spread;
    private String volume_24h;
    private String status;
    private String created_at;
    private String updated_at;

    public Currency() {
    }

    public String getExchange_id() {
        return exchange_id;
    }

    public void setExchange_id(String exchange_id) {
        this.exchange_id = exchange_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getBase_asset() {
        return base_asset;
    }

    public void setBase_asset(String base_asset) {
        this.base_asset = base_asset;
    }

    public String getQuote_asset() {
        return quote_asset;
    }

    public void setQuote_asset(String quote_asset) {
        this.quote_asset = quote_asset;
    }

    public String getPrice_unconverted() {
        return price_unconverted;
    }

    public void setPrice_unconverted(String price_unconverted) {
        this.price_unconverted = price_unconverted;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChange_24h() {
        return change_24h;
    }

    public void setChange_24h(String change_24h) {
        this.change_24h = change_24h;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getVolume_24h() {
        return volume_24h;
    }

    public void setVolume_24h(String volume_24h) {
        this.volume_24h = volume_24h;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Currency(String exchange_id, String symbol, String base_asset, String quote_asset, String price_unconverted, String price, String change_24h, String spread, String volume_24h, String status, String created_at, String updated_at) {
        this.exchange_id = exchange_id;
        this.symbol = symbol;
        this.base_asset = base_asset;
        this.quote_asset = quote_asset;
        this.price_unconverted = price_unconverted;
        this.price = price;
        this.change_24h = change_24h;
        this.spread = spread;
        this.volume_24h = volume_24h;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
