package ai.day8CF;

import java.util.PriorityQueue;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq  = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(8);
		pq.add(9);
		pq.add(15);
		pq.add(1);
		pq.add(1);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.remove(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());   //////low has high priority

	}

}
