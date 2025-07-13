package ai.day4;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=28;
		int sum =0;
		for(int i=1; i<num; i++){
			if(num%i==0){
				sum+=i;
			}
		}
		System.out.println(num);
	}

}
