package com.kodnest.learnings;
import java.util.*;
public class SecretMessageDecodre {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SecretMessageDecodre se=new SecretMessageDecodre();
		char ch=s.next().charAt(0);
		System.out.println(se.decodeCharacter(ch));
	}
	public int decodeCharacter(char ch)
	{
		return ch;
	}

}
