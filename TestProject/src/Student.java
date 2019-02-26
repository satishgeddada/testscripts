
public class Student {
int empid;
String name;

public void insertrecord(int r,String s){
	empid = r;
	name = s;
System.out.println("in Insert Record method");	
}
public void displayrecord()
{
	System.out.println(empid +" " +name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student mystd1 = new Student();
		Student mystd2 = new Student();
		Student mystd3 = new Student();
		
		mystd1.insertrecord(100, "Satish");
		mystd2.insertrecord(101, "Sai");
		mystd3.insertrecord(102, "Sriram");
		
		mystd1.displayrecord();
		mystd2.displayrecord();
		mystd3.displayrecord();
		
	}

}
