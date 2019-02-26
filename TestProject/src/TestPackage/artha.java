package TestPackage;
import java.util.Scanner;
public class artha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter num1: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Enter num2: ");
		int num2 = scanner.nextInt();
		scanner.close();
		System.out.println("num1+num2: "+ (num1+num2));
		System.out.println("num1-num2: "+ (num1-num2));
		System.out.println("num1*num2: "+ (num1*num2));
		System.out.println("num1/num2: "+ (num1/num2));
		
		
	}

}
