package ai.day4;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=100; i++){
			for(int j=2; j<Math.sqrt(i); j++){
				if(j%i!=0){
	
						System.out.println(i);
				}
			}
			
		}
		

	}

}
