package Day_3Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class FliterList {
	
	 public static void main(String[] args) {
		 String letter;
		 Scanner sc = new Scanner(System.in);
		
		 
		 ArrayList<String> lst= new ArrayList<String>();
	        lst.add("Ravi");
	        lst.add("Yuvraj");
	        lst.add("Sachin");
	        lst.add("Vishal");
	        lst.add("Sagesh");
	        lst.add("Vijay");
	        lst.add("Ajay");
	        System.out.println("Customer List As Follows");
	    System.out.println(lst);
	    System.out.println("-------------------------------------------------------");
        Iterator<String> itr = lst.iterator();
        System.out.println("Enter First letter Based On which  Customer List Must Be flitered :");
		 letter =sc.next();
      
        while (itr.hasNext())
        	
        {
        	 String curr = itr.next();
        	if (!curr.startsWith(letter)) {
                itr.remove();
            }
        }
 
        System.out.println(lst);
    }
}

        
        
	
