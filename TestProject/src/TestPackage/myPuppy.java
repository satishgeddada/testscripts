package TestPackage;

public class myPuppy {
	String name;
	int age;
	myPuppy(String name){
		System.out.println("Name choosen is:" + name);
	}
	void setage(int a){
		age = a;
	}
	void getage(){
		System.out.println("Puppy age: "+ age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myPuppy p1 = new myPuppy("Tommy");
		p1.setage(5);
		p1.getage();
	}

}
