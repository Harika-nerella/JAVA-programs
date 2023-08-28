package com.kodnest.learning;
import java.util.*;
public class TimeConverter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		System.out.println(convertToHours(m));
		s.close();
	}
	public static double convertToHours(int minutes)
	{
		return (double)minutes/60;
	}

}
