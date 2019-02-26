package TestPackage;

import java.util.Scanner;

public class Test123 {

	public static void main(String[] args) {
		System.out.println("Enter day number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		/*int b = 15;*/
		/*int c = 10;*/
		
		switch(a){
		case 1:
		System.out.println("Sunday");
		break;
		case 2:
		System.out.println("Monday");
		break;
		case 3:
		System.out.println("Tuesday");
		break;
		case 4:
		System.out.println("Wedensday");
		break;
		case 5:
		System.out.println("Thursday");
		break;
		case 6:
		System.out.println("Friday");
		break;
		case 7:
		System.out.println("Saturday");
		break;
		default:
		System.out.println("Invalid Number");
		break;
		}	
		
		
		sc.close();
		/*		int min = (a>b)?a:b;
		System.out.println(min);*/
		//		System.out.println(a>b && b>c);
		//		System.out.println(a>b & a>c);


	}

}
