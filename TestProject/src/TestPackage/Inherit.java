package TestPackage;

class fruit{
	String name = "apple";
	int qty = 5;
	void does(){
		System.out.println("Juice");
	}
}



public class Inherit extends fruit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruit f1 = new fruit();
		System.out.println(f1.name+f1.qty);
		f1.does();
		
	}

}
