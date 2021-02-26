package Day_2Assignments;

import java.util.Scanner;



public class DiamondProblem_Carrentals {

	interface Bikerentals{
		public void BikeRental();
		public void carrentals();
	}

	public static class Diamondproblem implements Bikerentals{


		public void BikeRental() {
			String name,Brand;
			int vehiclenumber,price,km,deposite, billingamt;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name:");
			name=sc.nextLine();
			System.out.println("Enter the Brand of vehicle");
			Brand=sc.next();
			System.out.println("Enter the vehicle Number:");
			vehiclenumber=sc.nextInt();
			System.out.println("Enter the Deposite amount:");
			deposite=sc.nextInt();
			System.out.println("Enter the Price per KiloMeter");
			price= sc .nextInt();
			System.out.println("Enter Total Kilometer Travelled");
			km= sc .nextInt();
			billingamt = price * km ;
			System.out.println("Your have Charged with" +" " + "Rs:"+ billingamt  ); 
		}
		
		public void carrentals() {
		String name,brand;
		int price,km,deposite, billingamt = 0, damagecost,amt = 0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter the Brand of vehicle :");
		brand=sc.nextLine();
		System.out.println("Enter the Deposite amount:");
		deposite=sc.nextInt();
		System.out.println("Enter the Price per KiloMeter");
		price= sc .nextInt();
		System.out.println("Enter Total Kilometer Travelled");
		km= sc .nextInt();
		System.out.println("Enter the damage cost");
		damagecost= sc .nextInt();
		
		amt= deposite-damagecost;
		billingamt = price * km + amt;
		if(damagecost != 0)
		{
			
		System.out.println(" You have been charged for  Damage" + " " + amt);
		}
		else
		{
		System.out.println(" You have been nt charged");
		
		}
		System.out.println(" You have been  charged for Total amount of" + " " + billingamt + " with damage");
		
		}
		public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("Automobile Rentals");
		System.out.println("Choose your option:");
		
		System.out.println("1.Bike \n2.Car");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		int i=sc.nextInt();
		Diamondproblem ob = new Diamondproblem();
		if(i==1) {
		ob.BikeRental();
		}
		if(i==2) {
		ob.carrentals();
		}

		}
		
			
			
	}


}
