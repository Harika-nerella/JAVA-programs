package com.kodnest.training;
import java.util.*;
public class Problem5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double purchaseAmount=s.nextDouble();
		checkDiscount(purchaseAmount);
	s.close();	
	}

	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100)
			System.out.println("Discount Applicable");
		else
			System.out.println("Discount not Applicable");
			
	}
	

}
