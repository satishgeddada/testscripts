package TestPackage;

public class Employee {
	String name, designation, city;
	double mobile;
	
	public Employee(String name){
		this.name = name;
	}
	public void designation(String des){
		designation = des;
		}
	public void city (String mycity){
		city = mycity;
	}
	public void mobile(double myMobile){
		mobile = myMobile;
	}
	public void printEmployee(){
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("City: "+city);
		System.out.println("Mobile: "+mobile);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Satish");
		Employee e2 = new Employee("Rahul");
		e1.designation("SQA");
		e1.city("Hyd");
		e1.mobile(12345);
		e2.city("Nagpur");
		e2.designation("SSE");
		e2.mobile(11111);
		
		e1.printEmployee();
		e2.printEmployee();
		
	}

}
