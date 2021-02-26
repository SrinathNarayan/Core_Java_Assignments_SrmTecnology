package Day2_ShippingProducts;

public class MobileProducts {
	int pid , rate;
	String brand, type;
	public MobileProducts(int pid, int rate, String brand, String type) {
		super();
		this.pid = pid;
		this.rate = rate;
		this.brand = brand;
		this.type = type;
	}
	

	public void showMobiledetails() {
		System.out.println("Product Details");
			System.out.println("-----------------");
		    System.out.println("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand +
			        		"\nProduct_Type = " + this.type);
			 }
			    


public void mobileprice() {
System.out.println("Product Details");
	System.out.println("-----------------");
    System.out.println("Mobile Price = " + this.rate );
	 }
}
