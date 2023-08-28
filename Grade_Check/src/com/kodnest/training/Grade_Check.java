package com.kodnest.training;
import java.util.*;
public class Grade_Check {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int grade=s.nextInt();
		test.gradeCheck(grade);
		s.close();
		
	}
public class test{
	

	public static void gradeCheck(int grade)
	{
		if(grade>50)
			System.out.println("Pass");
		else
		    System.out.println("Fail");
	}

}
}
