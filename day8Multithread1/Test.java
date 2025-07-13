package ai.day8Multithread1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Th1 t1 = new Th1();
		
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		
		Th2 t2 = new Th2();
		System.out.println(t2.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
		
		Thread.sleep(10000);
		
		System.out.println("Thank you");
		
		
		
		t1.setName("CountdownTimer");
		System.out.println(t1.getName());

	}

}
