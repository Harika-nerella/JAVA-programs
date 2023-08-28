package com.kodnest.learnings;
import java.util.*;
public class TemparatureConverterApp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double fahrenheit=s.nextDouble();
		TemparatureConverter t=new TemparatureConverter();
		
		
		
		System.out.printf("%.2f",t.convertFahrenheitToCelsius(fahrenheit));
		
	}

}
