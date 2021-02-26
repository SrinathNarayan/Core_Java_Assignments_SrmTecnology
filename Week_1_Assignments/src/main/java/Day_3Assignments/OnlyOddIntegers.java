package Day_3Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyOddIntegers {
	public static void main(String[] args) {
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
        int l=0;
        List <Integer> oddlist= new ArrayList<Integer>();
        for (int i=0;i<li.size();i++){
            int n=li.get(i);
            if(n%2!=0){
                l+=1;
                oddlist.add(li.get(i));
            }
        }
                if(l==0){
                    System.out.println("The are no odd Integer in the List");
                    System.out.println(li);
                }
                else{
                	System.out.println("The list:");
                    System.out.println(li);	
                   
                    System.out.println("The odd Integers in the list as follows");
                    System.out.println(oddlist+"\n");
                    
                }     
                }
}
