package com.otu.demo.otudemo.service;


import com.otu.demo.otudemo.obj.Quote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private List<Quote> quotes = new ArrayList<Quote>();

    public QuoteService(){

    }
    public Quote getQuote(){
        Random rn = new Random();
        int select = rn.nextInt(this.quotes.size());
        return this.quotes.get(select);
    }
    public void addQuote(Quote quote){
        this.quotes.add(quote);
    }
}
