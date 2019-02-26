
public class BreakAndContinue {
public static void main(String[] args){
	
	System.out.println("In the Break loop");
	for (int i=1;i<=5;i++){
		if (i==5) break;
		System.out.println(i);
		}
	System.out.println("In the Continue loop");
	for (int i=1;i<=5;i++){
		if (i==1) continue;
		System.out.println(i);
		}
	
}
}
