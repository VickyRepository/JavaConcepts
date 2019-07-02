package hanldingMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HandlingHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> a = new Hashtable<String, String>();
		a.put("name", "Vignesh");
		a.put("role", "tester");
		/*a.put("company", null);*/ // Hash table will not accept null values.
		
		System.out.println(a);

		System.out.println(a.get("name"));
		System.out.println(a.get("role"));
/*		System.out.println(a.get("company"));*/

		Set s = a.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}

}
