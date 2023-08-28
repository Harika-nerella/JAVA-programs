package com.kodnest.learning;
import java.util.*;
public class HalveIt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double num=s.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
		s.close();
	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

}
