
public class Amount {
int accno;
String name;
float amt;


public void deposit(float amount){
	amt = amount+amt;
	System.out.println("Deposited amount is "+amt);
}

public void insert(int x, String y, float z){
	accno = x;
	name = y;
	amt = z;
}

public void withdraw(float amount){
	if (amt<amount) {
		System.out.println("low balance");
	}
	else{
		System.out.println("Withdral of "+amt+" Successful");
	}
}
public void accountDisplay(){
	System.out.println(accno + " belongs to "+ name+ " has "+ amt);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amount myacc1 = new Amount();
		myacc1.insert(1122, "Satish", 10000);
		myacc1.accountDisplay();
		myacc1.deposit(5000);
		myacc1.withdraw(20000);
		
		
		
	}

}
