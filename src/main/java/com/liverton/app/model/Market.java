package com.liverton.app.model;

import java.util.List;

public class Market {

    private List<Currency> markets;
    private int next;

    @Override
    public String toString() {
        return "Market{" +
                "markets=" + markets +
                ", next=" + next +
                '}';
    }

    public Market(List<Currency> markets, int next) {
        this.markets = markets;
        this.next = next;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public Market() {
    }

    public Market(List<Currency> markets) {
        this.markets = markets;
    }

    public List<Currency> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Currency> markets) {
        this.markets = markets;
    }
}
