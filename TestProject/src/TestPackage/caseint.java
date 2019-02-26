package TestPackage;
import java.util.Scanner;
public class caseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any operation add sub div mul: ");
		Scanner scan = new Scanner(System.in);
		String arth = scan.nextLine();
		System.out.println("Enter num1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter num2: ");
		int num2 = scan.nextInt();
		scan.close();
		switch(arth)
		{
			case "add":
				System.out.println("Add is "+ (num1+num2));
				break;
			case "sub":
				System.out.println("Sub is "+ (num1-num2));
				break;
			case "div":
				System.out.println("Div is "+ (num1/num2));
				break;
			case "mul":
				System.out.println("Mul is "+ (num1*num2));
				break;
			default:
				System.out.println("Invalid arthematic operation");
				break;
		
		
		}
		
		
		
	}

}
