package ai.day8Multithread1;

public class cube extends Thread{
	public void run(){
		
		 for(int i=1; i<=5; i++){
			 System.out.println(Thread.currentThread().getName() + ": Cube of " + i + " is " + (i * i * i));
			 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
	}
}
