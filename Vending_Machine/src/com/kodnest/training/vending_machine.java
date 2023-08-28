package com.kodnest.training;
import java.util.*;
public class vending_machine {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String productCode=s.nextLine();
		getProduct(productCode);
		s.close();
	}
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "p01":
			System.out.println("coco cola");
			break;
		case "p02":
			System.out.println("Maaza");
			break;
		case "p03":
			System.out.println("Thums up");
			break;
		case "p04":
			System.out.println("Lemon");
			break;
		default:
			System.out.println("not available");
			break;
		}
	}

}
