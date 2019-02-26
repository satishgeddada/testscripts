package TestPackage;

public class Const {
	
	String name;
	int age;
	Const(int a){
		age = a;
	}
	
	Const(String t){
		name=t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const pl1 = new Const(10);
		Const pl2 = new Const("Java");
		
		pl1.getname("C++");
		
		pl1.printname();
		pl2.printname();
				
	}

	void getname(String t){
		name =t;
	}
	void printname (){
		System.out.println("Langauge is :" + name);
	}
}
