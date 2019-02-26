package TestPackage;

public class Website {

	String webname;
	int webage;
	
	Website(String name, int age){
		this.webname=name;
		this.webage=age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website site1 = new Website("Google",10);
		Website site2 = new Website("Yahoo", 20);
		Website site3 = new Website("Facebook", 5);
		
		System.out.println(site1.webname+" "+ site1.webage);
		System.out.println(site2.webname+" "+ site2.webage);
		System.out.println(site3.webname+" "+ site3.webage);
	}

}
