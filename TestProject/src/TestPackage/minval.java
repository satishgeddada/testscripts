package TestPackage;
import java.util.Scanner;
public class minval {
	static int minv;
	
	public static int minfn(int n1, int n2){
		
		if (n1>n2){
			minv = n2;
		}
			else{ 
				minv =n1;
			
		}
		return minv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		minfn(n1,n2);
		
		System.out.println(minv);
		
		
	
	}

}
