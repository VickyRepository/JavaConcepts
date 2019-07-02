package hanldingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HandlingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> a =new HashMap<String, String>();
		a.put("name", "arun"); // name = Key , arun = Key value.
		a.put("role","tester");
		a.put("company", "infosys");
		a.put("name", "Vignesh");
		a.put("role","tester");
		a.put("company", "cognizant");
		
		System.out.println(a.get("name")); 
		System.out.println(a.get("role"));
		System.out.println(a.get("company"));
		
	    Set<Entry<String, String>> s = a.entrySet();
	    
	    Iterator<Entry<String, String>> it = s.iterator();
	    
	    while(it.hasNext()) {
	    	
	    	System.out.println(it.next());
	    	
	    }
	}

}
