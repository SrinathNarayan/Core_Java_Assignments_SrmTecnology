package Day2_ShippingProducts;

public class FootwareProduct {
	int pid , size, rate;
	String brand, type;
	public FootwareProduct(int pid, int size, int rate, String brand, String type) {
		super();
		this.pid = pid;
		this.size = size;
		this.rate = rate;
		this.brand = brand;
		this.type = type;
	}
	public void productdetails() {
		System.out.println("Product Details");
			System.out.println("-----------------");
		    System.out.println("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Size = " + this.size + "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand +
			        		"\nProduct_Type = " + this.type);
			 }
	
	public void footprice() {
		System.out.println("Product Details");
			System.out.println("-----------------");
		    System.out.println("Clothing Price: = " + this.rate );
		    System.out.println("\nProduct Type = " + this.type);
			 }

}
