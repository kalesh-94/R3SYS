package ai.day8Multithread1;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		square s = new square();
		s.setName("squares 1 to 5");
		s.setPriority(8);
		
		
		
		
		
		cube c = new cube();
		c.setName("cube 1 to 5");
		c.setPriority(5);
	
		
		
		
		multiplication m = new multiplication();
		m.setName("Table of 5");
		m.setPriority(3);
		
		
		
		
		s.start();
		s.join();
        c.start();
        c.join();
        m.start();
        m.join();
		
		
	

	}

}
