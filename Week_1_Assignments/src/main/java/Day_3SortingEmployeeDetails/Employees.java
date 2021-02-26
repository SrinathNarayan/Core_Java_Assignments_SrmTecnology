package Day_3SortingEmployeeDetails;

import java.util.Comparator;




public class Employees {
	String name;
	int id;
	
	
	public Employees( int id,  String name) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "[ Employee Id=" + this.id +  "  "  + ",Employee Name=" + " "
	            + this.name + "]";
	}
		
		 public static Comparator<Employees> UserIdComparator = new Comparator<Employees>() { 
		        public int compare(Employees emp1, Employees emp2){
					return emp1.getId() -  emp2.getId(); 
		  
		                  
		              } 
		          };    
		          public static Comparator<Employees> UserNameComparator = new Comparator<Employees>() { 
		              
		              public int compare(Employees emp1, Employees emp2){ 
		        
		                        
		                        return emp1.getName() .compareTo (emp2.getName());
		                    } 
		                };
	}
	
	


