package com.app.controller;

import static ch.lambdaj.Lambda.*;

import java.util.List;

import ch.lambdaj.function.convert.Converter;

public class StringCalculator {

	public static int add(String input) {
		if (input.isEmpty())
			return 0;

		else if (input.contains(",")) {
			String[] tokens = input.split(",");
			List<Integer> numbers =  convert(tokens, new Converter<String, Integer>() {@Override
			public Integer convert(String from) {
				return toInt(from);
			}});
				
			//return toInt(tokens[0]) + toInt(tokens[1]);
			 return sum(numbers).intValue();

		} else
			return Integer.parseInt(input);
	}

	private static int toInt(String input) throws NumberFormatException {
		return Integer.parseInt(input);
	}
}
