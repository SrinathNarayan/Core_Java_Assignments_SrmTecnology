package Day_3Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapsort {
	static Map<String, Integer> map = new HashMap<>();
	static Map<String, Integer> Hmap = new HashMap<>();
	  public static void sortbykey() 
	    { 
	        ArrayList<String> sortedKeys = 
	                    new ArrayList<String>(map.keySet()); 
	          
	        Collections.sort(sortedKeys);  
	  
	        
	        for (String x : sortedKeys)  
	            System.out.println("KeyCity = " + x +  
	                        ", KiloMeter = " + map.get(x));      
	    } 
	      
	
	    public static void main(String args[]) 
	    { 
	        
	    	map.put("banglore", 380); 
	        map.put("goa", 1303); 
	        map.put("delhi", 10000); 
	        map.put("kerla", 600); 
	        map.put("punjab", 8740); 
	        System.out.println("Sorting Hashmap using keys");
	        System.out.println("-----------------------------");
	        System.out.println("Before Sorting ");
	       
	        System.out.println(" ");
	        System.out.println(map);
	        System.out.println(" ");
	        System.out.println("After Sorting");
	        System.out.println(" ");
	        sortbykey(); 
	        
	        

	        Hmap.put("banglore", 380); 
	        Hmap.put("goa", 1303); 
	        Hmap.put("delhi", 10000); 
	        Hmap.put("kerla", 600); 
	        Hmap.put("punjab", 8740); 
	        System.out.println(" ");
	        System.out.println("Sorting Hashmap using Values");
	        System.out.println("-----------------------------");
	        System.out.println("Before Sorting ");
	        System.out.println(" ");
	        System.out.println(Hmap);
	        System.out.println(" ");
	        System.out.println("After Sorting");
	        System.out.println(" ");
	       
	            sortbyvalue();
	        
	        
	    } 
	    


		private static void sortbyvalue() {
			
			
}
}
