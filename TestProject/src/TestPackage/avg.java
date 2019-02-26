package TestPackage;
import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		double[] arr = new double[n];
		double total = 0;
		
		for (int i=0;i<arr.length;i++){
			System.out.println("enter "+ (i+1)+" number");
			arr[i]=scanner.nextDouble();
		}
		scanner.close();
		
		for (int i=0;i<arr.length;i++){
			total = total+arr[i];
		}
		double average = total / arr.length;
		System.out.format("average: %.3f",average);
		
		
	}

}
