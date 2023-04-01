package com.otu.demo.otudemo;

import com.otu.demo.otudemo.service.QuoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OtuDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtuDemoApplication.class, args);
	}

	@Bean
	public QuoteService getQuoteService(){
		return  new QuoteService();
	}

}
