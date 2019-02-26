
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee myemp1 = new Employee("Satish");
		Employee myemp2 = new Employee("Sriam");
		Employee myemp3 = new Employee("Saikumar");
		
		myemp1.age(34);
		myemp1.designation("SQA");
		myemp1.salary(10000);
		myemp1.printemployee();
		
		myemp2.age(30);
		myemp2.designation("SSE");
		myemp2.salary(10000);
		myemp2.printemployee();
		
		myemp3.age(30);
		myemp3.designation("SE");
		myemp3.salary(10000);
		myemp3.printemployee();
	}

}
