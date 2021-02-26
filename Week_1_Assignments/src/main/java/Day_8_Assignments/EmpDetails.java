package Day_8_Assignments;

public class EmpDetails {
	int Id;
	 int Salary;
	String Name;
	String Role;
	public EmpDetails(int id, int Salary, String name, String role) {
		super();
		Id = id;
		Name = name;
		Role = role;
		Salary=Salary;
		
	}
	
	

	public  int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public  String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	@Override
	
	public String toString() { 
	     return "EmpId:"+ this.Id + " " + ", User Name :" + " " + this.Name  + ", Role :"  + " "+ this.Role; 
	     } 
	

}
