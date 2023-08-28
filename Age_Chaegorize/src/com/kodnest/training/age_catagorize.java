package com.kodnest.training;
import java.util.*;
public class age_catagorize {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		categorize(age);
		s.close();
	}
	public static void 	categorize(int age)
	{
		if(age>=0 && age<13)
			System.out.println("CHILD");
		else if(age>=13 && age<=19)
			System.out.println("TEEN");
		else if(age>=20 && age<=59)
			System.out.println("ADULT");
		else
			System.out.println("SENIOR");
	}

}
