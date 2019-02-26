public class Constrc {
int accno;
String name;
float amt;
String state;

Constrc(int a, String b, float c, String d){
	accno = a;
	name = b;
	amt = c;
	state = d;
}
Constrc(Constrc c){
	accno = c.accno;
	name = c.name;
	
	
}
public void display(){
	System.out.println(accno +" "+ name +" "+ amt +" "+ state);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrc myconst1 = new Constrc(111,"Satish",10000,"Andhra");
		myconst1.display();
		Constrc myconst2 = new Constrc(myconst1);
		myconst2.display();
		
	}

}
