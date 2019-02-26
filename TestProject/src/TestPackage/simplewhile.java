package TestPackage;
import java.util.Scanner;

public class simplewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			System.out.println(i*100);
			i++;
		}
		
	}

}
