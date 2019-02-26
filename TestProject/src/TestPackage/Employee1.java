package TestPackage;

public class Employee1 {
	String name;
	int age;
	String des;
	
	Employee1(String empname){
		name = empname;
	}
	
	void empAge(int empage){
		age = empage;
	}
	
	void empDesignation(String empdes){
		des =empdes;
	}
	
	void printEmployee(){
		System.out.println(name+" "+age+" "+ des);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp1 = new Employee1("Satish");
		Employee1 emp2 = new Employee1("Vijay");
		Employee1 emp3 = new Employee1("Rahul");

		emp1.empAge(35);
		emp2.empAge(37);
		emp3.empAge(30);
		
		emp1.empDesignation("QA");
		emp2.empDesignation("TL");
		emp3.empDesignation("SE");
		
		emp1.printEmployee();
		emp2.printEmployee();
		emp3.printEmployee();
	}

}
