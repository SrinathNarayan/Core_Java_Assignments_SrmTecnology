package Day4_Assignments;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;







public class CustomerSorting {
	public static void main(String[] args) {
        Customers e1 = new Customers(1, "ram", "Tv");
        Customers e2 = new Customers(2, "sham", "Phone");
        Customers e3 = new Customers(3, "ravi", "Shoes");
        Customers e4 = new Customers(4, "gopal", "Dress");
 
        List<Customers> Customer = new ArrayList<Customers>();
        Customer.add(e2);
        Customer.add(e3);
        Customer.add(e1);
        Customer.add(e4);
 
        System.out.println("Unsorted List");
        System.out.println(Customer);
        System.out.println("______________________________________________________________________");
        Collections.reverse(Customer);
        System.out.println("Sorted List");
        System.out.println(Customer);
    }
	
	
  
    
}





	

