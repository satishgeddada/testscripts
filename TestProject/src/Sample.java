
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Input = new Scanner (System.in);
		System.out.println("Input a number: ");
		long i = Input.nextLong();
		System.out.println("The Sum of digits is" + sumofdigits(i));
				
	}

	public static int sumofdigits(long i){
		
		int sum =0;
		while (i !=10){
			sum+= i%10;
			i /= 10;
				}
		return sum;
	}
	
	
}
