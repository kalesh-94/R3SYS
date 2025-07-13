package ai.day4;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int choise;
		
		do{
			
System.out.println("Enter your Shape to calculate area \n 1:rectangle \n 2: square \n 3: circle \n 4: triangle");
			
			int ch = sc.nextInt();
			
			switch(ch){
			case 1:
				 Area obj = new Area();
				add.addtion(x,y);
			break;
			case 2:
				Area sub = new Area();
				sub.subtract(x,y);
			break;
			case 3:
				Area mul = new Area();
				mul.multiply(x,y);
			break;
			case 4:
				Area div = new Area();
				div.divide(x,y);
				
			}
			System.out.println("Enter Your choise \n 1: To continue operations \n 2: To Quite");
			choise = sc.nextInt();
		}while(choise==1);

	}

}

class Area{
	void rectangle(int length, int width){
		System.out.println(length*width);
	}
	void square(int side){
		System.out.println(side*side);
	}
	void circle(int r){
		System.out.println(Math.PI*r*r);
	}
	void triangle(int base, int height){
		System.out.println(0.5*base*height);
	}
}