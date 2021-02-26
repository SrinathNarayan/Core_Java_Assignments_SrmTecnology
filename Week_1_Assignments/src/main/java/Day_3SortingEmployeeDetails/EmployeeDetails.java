package Day_3SortingEmployeeDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class EmployeeDetails {

	public static void main(String[] args) {
		List<Employees> Employee = new ArrayList<Employees>();
		
		Employees emp1 =new Employees(101, "Mota");
		Employees emp2 =new Employees(112, "Mehul");
		Employees emp3 =new Employees(301, "AjaY");
		Employees emp4 =new Employees(897, "Vijay");
		Employees emp5 =new Employees(222, "Gokul");
		Employees emp6 =new Employees(111,"Ramanath");
		Employees emp7 =new Employees(654, "Priya");
		Employees emp8 =new Employees(126, "Sri");
		
		Employee.add(emp1);
		Employee.add(emp2);
		Employee.add(emp3);
		Employee.add(emp4);
		Employee.add(emp5);
		Employee.add(emp6);
		Employee.add(emp7);
		Employee.add(emp8);
		
		System.out.println("Employee List Before Sorting");
		 System.out.println("---------------------------------------------------------------------------------------------\n");
		for(Employees  emp : Employee) {
		System.out.println(emp);
}
		  System.out.println("\nEmployee List sorted By Employee ID:"); 
	        System.out.println("---------------------------------------------------------------------------------------------\n");
	        Collections.sort(Employee , Employees.UserIdComparator);
	        for(Employees  idemp : Employee) {
	    		System.out.println(idemp);
			
	        }
	        


	        System.out.println("\nEmployee List sorted By Employee Name:"); 
	        System.out.println("---------------------------------------------------------------------------------------------\n");        
	    Collections.sort(Employee , Employees.UserNameComparator);
			for(Employees  nameemp : Employee) {
					System.out.println(nameemp);

	
}
}
}

