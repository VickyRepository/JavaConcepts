package hanldingMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HandlingTreeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> a =new TreeMap<String, String>();
		a.put("name", "arun"); // name = Key , arun = Key value.
		a.put("role","tester");
		a.put("Company", "infosys");
		a.put("name", "Vignesh");
		a.put("role","tester");
		a.put("Company", "cognizant"); // Capital letter will be first priority
		
		System.out.println(a.get("name")); 
		System.out.println(a.get("role"));
		System.out.println(a.get("Company"));
		
	    Set s = a.keySet();
	    
	    Iterator it = s.iterator();
	    
	    while(it.hasNext()) {
	    	
	    	System.out.println(it.next());
	    	
	    }

	}

}
