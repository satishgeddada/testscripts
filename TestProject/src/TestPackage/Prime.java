package TestPackage;

import java.util.Scanner;

public class Prime {


	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner a =new Scanner(System.in);
		int x=a.nextInt();
		int d,i;
		int flag =0;
		d=x/2;
		/*System.out.println(y+ +z);*/
		for (i=2;i<=d;i++)
		{
			if (x%i==0)
			{
				System.out.println("Not a prime number");
				flag=1;
				break;
			}
		}
		if (flag ==0)
		{
			System.out.println("Prime number");
		}
		a.close();


	}
}