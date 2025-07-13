package ai.day8CF;

import java.util.HashSet;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(1);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(7);
		
		System.out.println(h);
		
		for(int i=0; i<h.size(); i++){
			System.out.println(h);
		}

	}

}
