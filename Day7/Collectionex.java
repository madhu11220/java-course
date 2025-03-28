package full_stack_madhu;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collectionex {
  //adding and accessing elements in a collection
	public static void main(String[] args) {
		//list elements
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("python");
		list.add("node");
		
		System.out.println("List:"+list);
		
		
		//set example
		Set<String> set = new Hashset<>();
		
		
       set.add("Yamaha");
       set.add("RE");
       set.add("jawa");
       
       System.out.println("set:"+set);
       
       //map example
       Map<Integer , String>map = new HashMap<>();
       map.put(1, "madhu");
       map.put(2, "mega");
       map.put(3, "ilakki");
       
       
       System.out.println("map:"+map);
       
	}
}
