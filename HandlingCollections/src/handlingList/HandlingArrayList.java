package handlingList;

import java.util.ArrayList;
import java.util.Iterator;

public class HandlingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		/*System.out.println("Size : "+b.size());
		b.removeAll(b);
	    System.out.println("Size after removal:"+ b.size());*/
	
		Iterator<Integer> it = b.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
