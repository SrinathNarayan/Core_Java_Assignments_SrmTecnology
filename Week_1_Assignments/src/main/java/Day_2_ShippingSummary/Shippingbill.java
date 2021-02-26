package Day_2_ShippingSummary;

public class Shippingbill {
	String Customername ,modeofpayment , Address;
    int phoneno,shippingcharges;
public Shippingbill(String customername, String Address, int phoneno,String modeofpayment,int shippingcharges) {
		super();
		this.Customername = customername;
		this.Address = Address;
		this.phoneno = phoneno;
		this.modeofpayment = modeofpayment;
		
		this.shippingcharges = shippingcharges;
	}


public void shipdetails() {
		System.out.println("-----------------");
	    System.out.println("Customername  = " +this.Customername + "\nAddress = " +this.Address+ "\nModeofpayment= " +this.modeofpayment  + "\nPhoneno = " + this.phoneno  +
		        		"\nShippingcharges = " + this.shippingcharges);
		 }

	

}
