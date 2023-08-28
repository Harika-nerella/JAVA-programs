package com.kodnest.trainings;
import java.util.*;
public class ten_checker {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		checkMultipleOfTen( n);
		s.close();
		
	}
	public static void checkMultipleOfTen(int n)
	{
		if(n%10==0)
			System.out.println("the number is multiple of 10");
		else
			System.out.println();
	}

}
