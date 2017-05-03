package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
	public static <T> void printList(List<T> lst) { // accept List of Objects
														// only,
		// not List of subclasses of object
		for (T o : lst)
			System.out.println(o);
	}

	public static void main(String[] args) {
		List<Object> objLst = new ArrayList<Object>();
		objLst.add(new Integer(55));
		printList(objLst); // matches
		
		List<Integer> intLst = new ArrayList<Integer>();
		intLst.add(11);
		printList(intLst);

		List<String> strLst = new ArrayList<String>();
		strLst.add("one");
		printList(strLst); // compilation error
	}
}
