package Day2_ShippingModule;

import java.util.Scanner;

import Day_2ShippingProductSellers.Seller;
import Day_2_ShippingSummary.ShippingDetail;
import Day_2_ShippingPayment.Payments;
import Day2_ShippingProducts.AllProducts;

public class UserMainFrame {
	public static void main(String[] args) {

		System.out.println("Online Shopping and Shipping");
		System.out.println("Choose your option:");
		int i,J = 0,k = 0;
		System.out.println("1.Amazon \n2.Myntra");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		 i=sc.nextInt();
		System.out.println("=====================");
		Seller sell = new Seller();
		if(i==1) {
			sell.Amazon();
			System.out.println("Choose your option:");
			 J=sc.nextInt();
			 AllProducts Aproduct = new AllProducts();
			if(J==1) {
				Aproduct.tvorder();
				}
				if(J==2) {
					Aproduct. mobileorder();
				}
			}
			if(i==2) {
			sell.Myntra();
			System.out.println("Choose your option:");
		   k=sc.nextInt();
		   AllProducts Aproduct = new AllProducts();
			if(k==1) {
				Aproduct.clothorder();
				}
				if(k==2) {
					Aproduct. footorder();
				}
				
			}
			
			System.out.println("\n------------------------------------------\n");
			System.out.println("Willing to Place the order (Yes/No):");
			
		    String a=sc.next();
	        if(i== 1 && J == 1) {
	        	Payments pay = new Payments();
	      pay.tvpay();
	       
	}    else if (i== 1 && J == 2) {
		Payments pay = new Payments();
	     pay.mobilepay();
		
	     
	}    else if (i== 2 && k == 1) {
		Payments pay = new Payments();
	     pay.clothpay();
	     
		}else if (i== 2 && k == 2) {
			Payments pay = new Payments();
		     pay.footpay();
		}
	 
	        System.out.println("\n------------------------------------------\n");
			System.out.println("Willing to Ship the order (Yes/No):");
	        String b = sc.next();
	        ShippingDetail ship = new ShippingDetail();
	        ship.ship();
	        System.out.println("\n------------------------------------------\n");
	        System.out.println("ORDER Details");
	        System.out.println(" " );
	        if(i== 1 && J == 1) {
	        	AllProducts Aproduct = new AllProducts();
				Aproduct.tvorder();
	             
	      }    else if (i== 1 && J == 2) {
	    	  AllProducts Aproduct = new AllProducts();
				Aproduct.mobileorder();
	      	
	           
	      }    else if (i== 2 && k == 1) {
	    	  AllProducts Aproduct = new AllProducts();
	      	Aproduct.clothorder();
	           
	      	}else if (i== 2 && k == 2) {
	      		AllProducts Aproduct = new AllProducts();
	      		Aproduct.footorder();
	}
	        System.out.println(" ");
	        System.out.println("Your Order will be Shipped Within 10 Days");
	      
		}


}
