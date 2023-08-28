package com.kodnest.learning;
import java.util.*;
public class PowerOfSquares {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(squareNumber(num));
		
	}
	public static int squareNumber(int num)
	{
		return num*num;
	}

}
