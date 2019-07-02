package handlingList;

import java.util.ArrayList;

public class HandlingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		System.out.println("Size : "+b.size());
		b.removeAll(b);
	    System.out.println("Size after removal:"+ b.size());

	}

}
