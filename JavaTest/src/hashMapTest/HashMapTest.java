package hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("3", "a", "f");
		Employee e2 = new Employee("3", "a", "b");

		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("3", e1);
		map.put("3", e2);
		System.out.println("This is String : " + map.get("3"));
		
		Map<Integer, Employee> mapInt = new HashMap<Integer, Employee>();
		mapInt.put(1, e1);
		mapInt.put(1, e2);
		System.out.println("This is Integer : " + mapInt.get(1));

		Emp emp1 = new Emp(1, "a");
		Emp emp2 = new Emp(1, "b");
		Map<Emp, Emp> mapEmp = new HashMap<Emp, Emp>();
		mapEmp.put(emp1, emp1);
		mapEmp.put(emp2, emp2);
		
		Set<Emp> setEmp = mapEmp.keySet();

		for (Emp emp : setEmp) {
			System.out.println("Hash Map Emp - Set is : " + emp.getId());
			System.out.println("Hash Map Emp - Set is : " + emp.getName());
		}
		
		Map<Employee, Employee> map1 = new HashMap<Employee, Employee>();
		map1.put(e1, e1);
		map1.put(e2, e2);
		
		Set<Employee> set = map1.keySet();

		for (Employee emp : set) {
			System.out.println("Hash Map - Set is : " + emp.getEmployeeId());
			System.out.println("Hash Map - Set is : " + emp.getLastName());
		}

		Map<String, Employee> mapStr = new HashMap<String, Employee>();
		mapStr.put("3", e1);
		mapStr.put("3", e2);
		System.out.println("Map Str : " + mapStr.get("3").getLastName());

		/*
		 * Map mymap = new HashMap(); mymap.put("1", "one"); mymap.put("1",
		 * "not one"); mymap.put("1", "surely not one");
		 * System.out.println(mymap.get("1"));
		 */

	}

}
