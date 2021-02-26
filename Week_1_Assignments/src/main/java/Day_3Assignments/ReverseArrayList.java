package Day_3Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseArrayList {
	
		static String aa;
		static String bb;
		static String cc;
		static String dd;
		 static String ee;
		public static void main(String[] args) {
			 System.out.println("Integer Array List");
			System.out.println("Enter the Numbers");
			int a ,b ,c,d,e;
			
	Scanner sc = new Scanner(System.in);
			   a= sc.nextInt();
		       b= sc.nextInt();
		       c= sc.nextInt();
		       d= sc.nextInt();
		       e= sc.nextInt();
	List<Integer> li=new ArrayList<Integer>(); 
		     li.add(a);  
	         li.add(b);  
	         li.add(c);  
	         li.add(d);
	         li.add(e);
	         System.out.println(" ");
	         System.out.println("The Orginal  List");  
	         System.out.println(li);  
	         System.out.println("Integer ArrayList  Reversed");
	         Collections.reverse(li);
	         System.out.println(" ");
	         System.out.println(li);
	         
	        System.out.println("------------------------------------------ ");
	        System.out.println();
	        System.out.println("String Array List");
	     	System.out.println("Enter the Names");
	     	
			  
	     	Scanner names = new Scanner(System.in);
			   aa= names.next();
		       bb= names.next();
		       cc= names.next();
		       dd= names.next();
		       ee= names.next();
			
			  

	List<String> Sl=new ArrayList<String>(); 
	Sl.add(aa);  
	Sl.add(bb);  
	Sl.add(cc);  
	Sl.add(dd);
	Sl.add(ee);  
	System.out.println(" ");
	System.out.println("The Original list :"); 
	  System.out.println(Sl);
	ListIterator<String> listIterator = Sl.listIterator(Sl.size());
	System.out.println("   ");
	System.out.println(  "String ArrayList  Reversed :");
	while(listIterator.hasPrevious()){
		
	  System.out.println(listIterator.previous());
	}

		}


	}

