package com.kodnest.trainings;
import java.util.*;
public class Second_method {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		char ch=s.next().charAt(0);
		check(ch);
		s.close();
	}
	public static void check(char ch)
	{
		if(Character.isDigit(ch))
			System.out.println("digit");
		else if(!Character.isLetter(ch))
			System.out.println("special character");
		else
		{
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
					System.out.println("lower case vowel");
				else
					System.out.println("upper case vowel");
				break;
			default:
				if(Character.isLowerCase(ch))
					System.out.println("lower caes consonant");
				else
					System.out.println("upper case consonant");
						
			}
		}
	}

}
