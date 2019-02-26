
public class Website {

	String webName;
	int webage;
	
	Website(String name, int age){
		this.webName = name;
		this.webage = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website obj1 =  new Website("yahoo",20);
		Website obj2 = new Website ("Google",15);
		
		System.out.println(obj1.webName+obj1.webage);
		System.out.println(obj2.webName+obj2.webage);
	}

}
