public class Employee {

	String name;
	int age;
	String designation;
	double salary;
	
	
public Employee (String name){
	this.name = name;
}

public void age(int empAge){
	age = empAge;
}

public void designation(String empdesignation){
	designation = empdesignation;
}
public void salary(double empsalary){
	salary = empsalary;
}
public void printemployee (){
	
	System.out.println("Employee name is "+name);
	System.out.println("Employee age is "+ age);
	System.out.println("Employee designation is "+designation);
	System.out.println("Employee salary is "+salary);
	
}

}
