class Adder{
	static int add(int x, int y){
		return x+y;
	}
	static int add(int x, int y, int z){
		return x+y+z;
	
	}
}
public class TestOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(3,7));
		System.out.println(Adder.add(3,4,5));
	}

}
