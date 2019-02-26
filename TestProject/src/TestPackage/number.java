package TestPackage;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		if (i>100){
			System.out.println("Number is greater than 100");
		}
		else{
			if (i<50){
				System.out.println("Number is less than 50");
			}
			else {
				System.out.println("Number is greater than 50");
			}
		}
		
	}

}
