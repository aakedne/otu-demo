package com.otu.demo.otudemo;

import com.otu.demo.otudemo.obj.Quote;
import com.otu.demo.otudemo.service.QuoteService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class OtuDemoApplicationTests {

	QuoteService quoteService;

	@Before
	public void before(){
		this.quoteService = new QuoteService();

	}

	@Test
	public void contextLoad () {
		this.quoteService.addQuote(new Quote("ABC", "D"));
		assertEquals("ABC", this.quoteService.getQuote().getValue());
	}
	@Test
	public void testGetQuoteMultiple(){
		this.quoteService.addQuote(new Quote("ABC", "D"));
		this.quoteService.addQuote(new Quote("EFG", "H"));
		assertTrue(
				"ABC".equals(this.quoteService.getQuote().getValue()) ||
				"EFG".equals(this.quoteService.getQuote().getValue())

		);

	}

}
