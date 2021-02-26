package Day4_Assignments;

import java.util.Comparator;

import Day_3SortingEmployeeDetails.Employees;

public class Trainers {
	public class SalaryCamparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
	String TrainerName,PlatformName,CompanyName;
	int Salary;
	public Trainers(String trainerName, String platformName, String companyName, int salary) {
		super();
		TrainerName = trainerName;
		PlatformName = platformName;
		CompanyName = companyName;
		Salary = salary;
	}
	public String getTrainerName() {
		return TrainerName;
	}
	public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}
	public String getPlatformName() {
		return PlatformName;
	}
	public void setPlatformName(String platformName) {
		PlatformName = platformName;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Trainers [TrainerName=" + this.TrainerName + ", PlatformName=" + this.PlatformName + ", CompanyName="
				+this.CompanyName + ", Salary=" + this.Salary + "]";
	}
	
	 public static Comparator<Trainers> SalaryCamparator = new Comparator<Trainers>() { 
	        public int compare(Trainers emp1, Trainers emp2){
	        	return emp1.getSalary()  -  emp2.getSalary();
	  
	                  
	              } 
	          };    
	          public static Comparator<Trainers> NameComparator = new Comparator<Trainers>() { 
	              
	              public int compare(Trainers emp1, Trainers emp2){ 
	        
	                        
	                        return emp1.getTrainerName() .compareTo (emp2.getTrainerName());
	                    } 
	                };
	/*	
	public static Comparator SalaryCamparator() {
		// TODO Auto-generated method stub
		class SalaryCamparator implements Comparator<Trainers>{

			@Override
			public int compare(Trainers o1, Trainers o2) {
				// TODO Auto-generated method stub
				return o1.getSalary()  -  o2.getSalary();
			}


	
		}
		return null;
}
	public static Comparator NameComparator() {
		class NameComparator implements Comparator<Trainers> {

			@Override
			public int compare(Trainers o1, Trainers o2) {
				// TODO Auto-generated method stub
				return o1.getTrainerName() .compareTo(o2.getTrainerName());
			}
			
	}
		return null;*/
	
	}
	
	
