package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.controller.StringCalculator;

@SpringBootTest
class DemoApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	 @Test
	    void empty_string_should_return_0() {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(0, stringCalculator.add(""));
	    }

	    @Test
	    void string_with_single_number_should_return_number_as_int() {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(1, stringCalculator.add("1"));
	    }
	    
	    @org.junit.jupiter.api.Test
		 void shouldReturnSunOnTwoNumbersDelimitedByComma() {
			  assertEquals(3, StringCalculator.add("1,2"));
		 }
		 
		 
		 
		 @org.junit.jupiter.api.Test
		 void shouldReturnSunOnMultipleNumbers() {
			  assertEquals(6, StringCalculator.add("1,2,3"));
		 }

}
