class Dog{
void eat(){
	System.out.println("Eating");
}
}
class Greyhound extends Dog{
	void type(){
		System.out.println("This is Greyhound");
	}
}
class Puppy extends Dog{
	void type(){
		System.out.println("This is Puppy");
	}
	
}

public class Animal{  

	
	public static void main(String args[]){  
		Puppy mypup1 = new Puppy();
		Greyhound mypup2 = new Greyhound();
		mypup1.eat();
		mypup1.type();
		mypup2.eat();
		mypup2.type();		
	
	}  }