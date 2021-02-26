package Day_3Assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		
		Map<String, String> CustomerList= new TreeMap<String, String>(Collections.reverseOrder());
		
		CustomerList.put( "1","Ram");
		CustomerList.put("2","Sham");
		CustomerList.put("3","Ravi");
		CustomerList.put("4","Sri");
		CustomerList.put("5","Latta");
		CustomerList.put("6","Rampal");
		CustomerList.put("7","Ramnath");
		System.out.println("TreeMap");
		Set set = CustomerList.entrySet();
		Iterator il = set.iterator();
		
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("TreeMap In Reverse Order");
		System.out.println("---------------------------------");
		System.out.println("");
		while (il.hasNext()) {
			Map.Entry me = (Map.Entry)il.next();
			
			System.out.println(me.getKey()+ ":" +me.getValue());
		
			
		}
		
			   
		   SortedMap<String, String> listcustomers = new TreeMap<String, String>();

			   listcustomers.put( "1","Ram");
			   listcustomers.put("2","Sham");
			   listcustomers.put("3","Ravi");
			   listcustomers.put("4","Sri");
			   listcustomers.put("5","Latta");
			   listcustomers.put("6","Rampal");
			   listcustomers.put("7","Ramnath");
			   System.out.println("---------------------------------");
		        System.out.println("Tree Map Back to Normal");
		        System.out.println("---------------------------------");
		        
		        System.out.println(listcustomers);
			
		
            }
		
	
		
	}


