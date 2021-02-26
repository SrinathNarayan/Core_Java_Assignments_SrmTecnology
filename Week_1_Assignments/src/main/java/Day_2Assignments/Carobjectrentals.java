package Day_2Assignments;

import java.util.Scanner;



public class Carobjectrentals {
	String vehicletype ,brand, fueltype, Vehiclenumber,depositamt ;
	int  time;
    Scanner sc  = new Scanner(System.in);
    
    
         public  void Rental() {
		 System.out.println("Enter the type of Vehicle");
		 vehicletype=sc.nextLine();
		 System.out.println("Enter the Brand of Vehicle");
		 brand=sc.nextLine();
		 System.out.println("Enter the Type of Fuel of Vehicle");
		 fueltype=sc.nextLine();
		 System.out.println("Enter the Vehicle Number");
		 Vehiclenumber=sc.nextLine();
		 System.out.println("Enter the Deposite Amount Given ");
		 depositamt=sc.nextLine();
		
		 
	 }
   
   public void timetraveled() {
	   System.out.println("Enter the  Total time Traveled in  Vehicle in Hours");
		 time=sc.nextInt();
		 if(time>12) {
			 System.out.println("You are Charged for the Full Day");
		 }
		 else {
			 System.out.println("You are Charged for the Half Day");
			 
		 }
   }
   
   
   public void printinfo(){
	   System.out.println("  " );
	   System.out.println("Billing Info : "  );
	   System.out.println("Enter the type of Vehicle :" + " "+ vehicletype );
	   System.out.println("Enter the Brand of Vehicle:" + " "+ brand );
	   System.out.println("Enter the Type of Fuel of Vehicle:" + " " +fueltype);
	   System.out.println("Enter the Vehicle Number:" + " " +  Vehiclenumber);
	   System.out.println("Enter the Deposite Amount Given: " + " " + depositamt);
		
	   
   }
	   
		 public static void main(String[] args) {
			 Carobjectrentals rent= new Carobjectrentals();
			 rent.Rental();
			 rent.timetraveled();
			 rent.printinfo();
			 
			 
		 }

}
