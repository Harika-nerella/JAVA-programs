package reverse_arraycom.kodnest.trainings;
import java.util.*;
public class program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int a[]=new int[s.nextInt()];
		System.out.println("the elements are");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		printArray(a);
		s.close();
	}
	public static void printArray(int a[])
	{
		System.out.println("the elements in forward direction are");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("the elements in reverse direction are");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}
