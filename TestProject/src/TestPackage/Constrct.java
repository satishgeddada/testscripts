package TestPackage;

public class Constrct {

	String name;
	int age;
	
	Constrct(){
		name="Satish";
		age=35;
	}
	Constrct(String myname, int myage){
		this.name=myname;
		this.age=myage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrct per1 = new Constrct();
		Constrct per2 = new Constrct("Bindu",30);
		
		System.out.println(per1.name+" "+per1.age);
		System.out.println(per2.name+" "+per2.age);
	}

}
