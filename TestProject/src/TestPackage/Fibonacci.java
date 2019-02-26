package TestPackage;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner a =new Scanner(System.in);
		int x=a.nextInt();
		int y =0,z=1,i,f;
		
		/*System.out.println(y+ +z);*/
		
		for (i=2;i<=x;i++)
		{
			f=y+z;
			System.out.println(f);
			y=z;
			z=f;
			
		}
		
		
		
	a.close();
	}
	

}
