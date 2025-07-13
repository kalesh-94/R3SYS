package ai.day8CF;

import java.util.HashMap;



public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "kalesh");
		hm.put(2, "kalesh");
		hm.put(3, "patil");
		hm.put(4, "gVagan");
		hm.put(5, "kalesh");
		
		System.out.println(hm);
		
		hm.remove(3);
		System.out.println(hm);
		
		
		///setview of hashMap
		System.out.println(hm.entrySet());
	}

}
