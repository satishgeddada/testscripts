
public class States {
int sno;
String state;
String capital;

public void insertstate(int x, String y, String z){
	sno = x;
	state = y;
	capital = z;
}
public void displaystates(){
	System.out.println(sno+" "+state+" "+capital);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		States mystate1 = new States();
		States mystate2 = new States();
		States mystate3 = new States();
		
		mystate1.insertstate(1, "Andhra", "Vijayawada");
		mystate2.insertstate(2, "Telangana", "Hyderabad");
		mystate3.insertstate(3, "Maharastra", "Mumbai");
		
		mystate1.displaystates();
		mystate2.displaystates();
		mystate3.displaystates();
	}

}
