package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == "c")
				System.out.println(i);
		}

		for (int j = 0; j < 10; j++) {
			list2.add(j);
		}
		System.out.println(list2);
		
		
		
		Set<String> set1=new HashSet<String>();
		Set set2=new HashSet();
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("a");
		set1.add("b");
		set1.add("c");
		
		set2.add(11);
		set2.add("b");
		set2.add(22);

		System.out.println(set1);
		System.out.println(set2);
		
		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "Gaurav");
		hm.put(2, "Ram");
		hm.put(3, "Sham");
		hm.put(2, "Rahul");//Previous key value is get updated with new
		
		System.out.println(hm);
		System.out.println(hm.get(3));
	}
}
