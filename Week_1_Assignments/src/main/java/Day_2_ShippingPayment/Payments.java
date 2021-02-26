package Day_2_ShippingPayment;

import Day2_ShippingProducts.AllProducts;


public class Payments {
	public void tvpay() {
		System.out.println(" ");
		System.out.println("Order Summary");
	     System.out.println("=============");
	     AllProducts Aproduct = new AllProducts();
	     Aproduct.tvate();
	     System.out.println("Only Cash On Delivary Available");
	}
	 
	public void mobilepay() {
		System.out.println(" ");
		System.out.println("Order Summary");
	     System.out.println("=============");
	     AllProducts Aproduct = new AllProducts();
	     Aproduct.mobilerate();
	     System.out.println("Only Cash On Delivary Available");
	}
     	 
	public void clothpay() {
		System.out.println(" ");
		System.out.println("Order Summary");
	     System.out.println("=============");
	     AllProducts Aproduct = new AllProducts();
	     
	     Aproduct.clothrate();
	     System.out.println("Only Cash On Delivary Available");
	}
	public void footpay() {
		System.out.println(" ");
		System.out.println("Order Summary");
	     System.out.println("=============");
	     AllProducts Aproduct = new AllProducts();
	     Aproduct.footrate();
	     System.out.println("Only Cash On Delivary Available");
	}
}
