package ai.day8Multithread1;

public class multiplication extends Thread{
	public void run(){
		
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName() + ": 5 x " + i + " = " + (5 * i));
			 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
