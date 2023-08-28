package com.kodnest.trainings;
import java.util.*;
public class character_Identifier {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		identifyCharacter(ch);
		
		s.close();
	}
	public static void identifyCharacter(char ch)

	{
		if(ch>='a' && ch<='z')
		    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		    	System.out.println("lower case vowel");
		    else
		    	System.out.println("lower case consonant");
		else if(ch>='A' && ch<='Z')
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			    System.out.println("upper case vowel");
			else
				System.out.println("upper case consonant");
		else if(ch>='0' && ch<='9')
		     System.out.println("digit");
		else 
			System.out.println("special charater");
			

	

	}

}
