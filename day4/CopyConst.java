package ai.day4;

public class CopyConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Join j1 = new Join("R3", "Rcpit ");
		Join j2 = new Join("sys", "shirpur");
		Join j3 = new Join(j1,j2);
			

	}
	
	
}

class Join {
	String x, y;
	
	Join(String a, String b){
		x=a;
		y=b;
	}
	
	
	Join(Join p, Join q){
		String one  = p.x + q.x;
		String two  = p.y + q.y;
		System.out.println(one +" "+two);
	}
	
	
}
