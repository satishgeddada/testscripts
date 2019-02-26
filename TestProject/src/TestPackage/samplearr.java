package TestPackage;
import java.util.Scanner;
public class samplearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of values to print: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int[] arr = new int[n];
		for(int i=1;i<=n;i++){
			System.out.println(i*100);
			;
		}
		
	}

}
