package ai.day8CF;
import java.util.*;

import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("kalesh");
		ls.add("drup");
		ls.add("Tejas");
		ls.add("abhijeet");
		ls.add("Lavanya");
		ls.add(5, "Harshal");
		
//		System.out.println(ls); 
//		print using for loop
		
//		for(int i=0; i<ls.size(); i++){
//			System.out.println(ls.get(i));
//		}
		
		
		
		///using enhanced for loop 
//		for(String s:ls){
//			System.out.println(s);
//		}
		
		
//		using_itorator 
		Iterator<String> itr = ls.iterator();
		
		while(itr.hasNext()){
			String s  = itr.next();
			System.out.println(s);
		}
	
		
		
		
		ls.remove(2);
		ls.remove(0);
		ls.remove(1);
		System.out.println(ls);
	
		
	}
	

}
