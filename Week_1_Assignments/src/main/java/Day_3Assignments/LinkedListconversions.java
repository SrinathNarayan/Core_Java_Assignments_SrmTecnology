package Day_3Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListconversions {
	public static void main(String[] args) {
		 System.out.println("LinkedList To ArrayList Conversion");
		 System.out.println("----------------------------------------");
			System.out.println("Enter Any  5 States Names:");
			String a ,b ,c,d,e;
			
	Scanner sc = new Scanner(System.in);
			   a= sc.nextLine();
		       b= sc.next();
		       c= sc.next();
		       d= sc.next();
		       e= sc.next();
	LinkedList<String> linklist=new LinkedList<String>(); 
	linklist.add(a);  
	linklist.add(b);  
	linklist.add(c);  
	linklist.add(d);
	linklist.add(e);
	System.out.println(" ");
	System.out.println("LinkedList");
	System.out.println(linklist);
	
	
	ArrayList<String> arrayList = new ArrayList<String>(linklist);
	System.out.println("----------------------------------------");
	System.out.println("Converted Array list");
	System.out.println(" ");
	System.out.println(arrayList);
	System.out.println("----------------------------------------");

	System.out.println("Reversed Array List");
	System.out.println(" ");
	Collections.reverse(arrayList);
	System.out.println(arrayList);
	System.out.println("----------------------------------------");
	System.out.println(" ");
	System.out.println("Sorted ArrayList");
	System.out.println(" ");
	Collections.sort(arrayList);
	System.out.println(arrayList);
		
	}

}
