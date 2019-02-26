
public class EmployeeTest1 {

	String name;
	int empid;
	String designation;
	double salary;
	
	
	public EmployeeTest1(String name){
		System.out.println("Name: " + name);
	}
	public void empid (int id){
		empid = id;
	}
	public void designation (String desi){
		designation = desi;
	}
	public void salary (double sal){
		salary = sal;
	}
	
	public void PrintEmployee(){
		
		System.out.println("Empl ID: " + empid);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTest1 empOne = new EmployeeTest1("Satish");
		EmployeeTest1 empTwo = new EmployeeTest1("Rahul");
		
				empOne.empid(30);
				empOne.designation("QA");
				empOne.salary(2000);
				empOne.PrintEmployee();
				empTwo.empid(25);
				empTwo.designation("Dev");
				empTwo.salary(1000);
				empTwo.PrintEmployee();
		
	}

}
