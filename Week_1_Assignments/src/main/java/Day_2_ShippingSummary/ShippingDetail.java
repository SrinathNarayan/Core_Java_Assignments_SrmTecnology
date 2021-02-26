package Day_2_ShippingSummary;



public class ShippingDetail {
static Shippingbill SB;
	
	
	public void ship() {
		
		
		System.out.println(" ");
		System.out.println("Shipping Summary");
	    System.out.println("=================");
	    System.out.println("Customer Details");
		SB = new Shippingbill("RAM","WEST KK NAGAR",3625415,"CASH",10000);
		
		SB.shipdetails();
}


}
