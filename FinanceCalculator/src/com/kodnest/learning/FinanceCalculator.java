package com.kodnest.learning;
import java.util.*;
public class FinanceCalculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double p=s.nextDouble();
		double t=s.nextDouble();
		double r=s.nextDouble();
		FinanceCalculator F=new FinanceCalculator();
		System.out.printf("%.2f",F.calculateSimpleInterest(p,r,t));
		
		s.close();
	}
	public double calculateSimpleInterest(double principal, double rate, double time)
	{
		return principal*rate*time;
	}

}
