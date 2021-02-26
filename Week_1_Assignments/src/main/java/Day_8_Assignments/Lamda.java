package Day_8_Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;






public class Lamda {
	public static void main(String[] args) {  
		System.out.println("Using lamda Function");
        List<EmpDetails> list=new ArrayList<EmpDetails>();  
        list.add(new EmpDetails(1,20000,"Shri ","Java Developer"));  
        list.add(new EmpDetails(3,30000,"Muthu ","ANdroid Developer"));  
        list.add(new EmpDetails(2,25000,"Mota ","Backnd Developer"));  
        list.add(new EmpDetails(4,600000,"Raam ","Angulsr Developer"));  
        list.add(new EmpDetails(5,70000,"Rabu ","Java Developer"));  
        list.add(new EmpDetails(6,20000,"Seenu ","Android Developer"));  
        System.out.println("Employee list Before Filtering Using Lamda");
        System.out.println(list);
    
        List roles = list.stream() 
       	     .filter((EmpDetails) -> EmpDetails.Role.equals("Java Developer")) 
       	     .collect(Collectors.toList()); 
        System.out.println(" " );
  		System.out.println("------------------------------------------------");
  		
  		System.out.println("Employee list After Filtering Using Lamda Only Java Developers");
       	     System.out.println(roles); 
       	     
       	     
       	  Stream<EmpDetails> filtered_data = list.stream().filter(p -> p.Salary > 20000);  
          
            
          filtered_data.forEach(  
        		  EmpDetails -> System.out.println(EmpDetails.Name+": "+EmpDetails.Salary)  
          );  
          System.out.println(" " );
    		System.out.println("------------------------------------------------");
    	
          
          list.sort((p1, p2) -> p1.Name.compareTo(p2.Name));
          System.out.println("After sorting Using Lamdaa Order by Name  : " ); 
          System.out.println(list);
  		
  		
  		System.out.println(" " );
  		System.out.println("------------------------------------------------");
  		
  		
		 new Lamda().TreeMapCollection();
  		
	}  
	public void TreeMapCollection()
	 {
		 TreeMap<Integer, EmpDetails> mlist =  
	             new TreeMap<Integer, EmpDetails>((o1, o2) -> (o1 > o2) ?  
	                                         -1 : (o1 < o2) ? 1 : 0); 
		 mlist.put(1, new EmpDetails(101, 21000, "zzz", "JAva")); 
		 mlist.put(2, new EmpDetails(111, 2800, "xx", "Android"));
		 mlist.put(3, new EmpDetails(211, 29000, "Mn", ".net"));
		 mlist.put(4, new EmpDetails(123, 270000, "jh", "Angular"));
		 mlist.put(5, new EmpDetails(145, 21235, "lj", "Java")); 

	  System.out.println("After sorting Using Lamdaa  : " ); 
	  System.out.println(mlist);
	  
	 }
	

    }  

