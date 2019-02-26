
public class Puppy {
	int puppyAge;
	public Puppy (String name){
		System.out.println("Puppy name is: " + name);	
		
	}
	public void Setage (int age){
		puppyAge = age;
	}
	public int Getage (){
		System.out.println("Entered age is: " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("Tommy");
		myPuppy.Setage(2);
		
		myPuppy.Getage();
		System.out.println("Varaiable value: " + myPuppy.puppyAge);
	}

}
