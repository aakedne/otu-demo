package com.otu.demo.otudemo.endpoint.rest;

import com.otu.demo.otudemo.obj.Quote;
import com.otu.demo.otudemo.service.QuoteService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEndpoint {
    private QuoteService quoteService;

    public DemoEndpoint(QuoteService quoteService){
        this.quoteService =  quoteService;
    }

    @RequestMapping ("/Quote")
    public Quote getQuote(){
        return this.quoteService.getQuote();
    }

    @RequestMapping(value = "/quote", method = RequestMethod.POST)
    public void addQuote(@RequestBody Quote quote) {
        this.quoteService.addQuote(quote);

    }

}

