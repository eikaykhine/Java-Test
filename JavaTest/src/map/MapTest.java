package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	static public class pair
	 {
	     public int x;
	     public int y;
	     public pair(int a , int b)
	     {
	         x = a;
	         y = b;
	     }
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "pair [x=" + x + ", y=" + y + "]";
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			pair other = (pair) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	 }
	
	public static void main(String[] args) {
		
		 HashMap<pair,Integer>m = new HashMap<pair,Integer>();
	     m.put(new pair(1,2), 3);
	     if(m.containsKey(new pair(1,2)))
	     {
	         System.out.println("is there " + m.get(new pair(1,2)));
	     }
		
		HashMap<Integer, String> test = new HashMap<Integer, String>();
		test.put(1, "one");
		test.put(2, "two");
		System.out.println("Hash Map output : " + test.get(1));
		System.out.println("Entry Set : " + test.entrySet());
		System.out.println("Map Values : " + test.values());
		System.out.println("Map Keys : " + test.keySet());
		System.out.println("Check key contains : " + test.containsKey(4));
		System.out.println("Is Empty : " + test.isEmpty());
		HashMap<Integer, String> tt = new HashMap<Integer, String>();
		tt.put(3, "three");
		test.putAll(tt);
		System.out.println("Entry Set : " + test.entrySet());
		System.out.println("Check value contains : " + test.containsValue("three"));
		HashMap<Integer, String> cc = (HashMap<Integer, String>) test.clone();
		System.out.println("Clone : " + cc);

		// Merging two maps
		HashMap<Integer, String> aa1 = new HashMap<Integer, String>();
		aa1.put(100, "hello");
		aa1.put(101, "nice");
		System.out.println("aa1 : " + aa1);
		HashMap<Integer, String> aa2 = new HashMap<Integer, String>();
		aa2.put(100, "hello");
		aa2.put(102, "good");
		aa2.put(102, "copy");
		System.out.println("aa2 : " + aa2);
		HashMap<Integer, String> aa3 = new HashMap<Integer, String>();
		aa3 = new HashMap<>(aa1);// copy aa1 values
		// aa2.putAll(aa1);// copy aa1 values
		aa3.putAll(aa2);// copy aa2 values
		System.out.println("aa3 with unsorted map : " + aa3);
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(aa3);
		System.out.println("Tree Map with sorted map : " + treeMap);
		for (String str : aa3.values()) {
			System.out.println("aa3 values with foreach loop : " + str);
		}
		System.out.println("aa3 size :"+aa3.size());
		// output both key & value with foreach loop
		for (Integer id : treeMap.keySet()) {
			String key = id.toString();
			String value = treeMap.get(id).toString();
			System.out.println(key + " " + value);
		}

	}

}
