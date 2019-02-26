package TestPackage;
import java.util.Scanner;

public class average1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers you want to Enter: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		double[] arr = new double[n];
		double total = 0;
		
		for(int i=0;i<arr.length;i++){
			switch(i+1){
			case 1:
				System.out.println("Enter "+(i+1)+"st number: ");
				break;
			case 2:
				System.out.println("Enter "+(i+1)+"nd number: ");
				break;
			case 3:
				System.out.println("Enter "+(i+1)+"rd number: ");
				break;
			default:
				System.out.println("Enter "+(i+1)+"th number: ");
				break;
			}
			arr[i] = scanner.nextDouble();
			
		}
		scanner.close();
		 for(int i=0;i<arr.length;i++){
			 total = total+arr[i];
		 }
		double average = total / arr.length;
		System.out.format("Average of all the numbers is: %.3f", +average);
		
		
	}

}
