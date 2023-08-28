package com.Kodnest.trainings;


public class ArithmaticOperations {
	public static void main(String[] args) {
		
       
	    double z=divideNumbers(20, 4);
	   
	    System.out.println(subtractNumbers(20, 5));
	    System.out.println(multiplyNumbers(4, 5));
	    System.out.printf("%.2f\n",z);
	    System.out.println(findRemainder(10, 3));
	    
	}
	static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}

}
