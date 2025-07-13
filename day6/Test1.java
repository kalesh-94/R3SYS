package ai.day6;

public class Test1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		/////-------Dynamic binding-------------
		Base obj = new Base();
		obj.display();
		
		obj = new Child1();
		obj.display();
		
		obj = new Child2();
		obj.display();
		
		

	}

}
