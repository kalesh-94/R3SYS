package ai.day8Multithread1;

public class Th2 extends Thread{
	public void run(){
		for(int i=10; i>0; i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
