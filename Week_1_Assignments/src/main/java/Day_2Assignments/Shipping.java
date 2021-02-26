package Day_2Assignments;

import java.util.Scanner;



public class Shipping {
	int productid, QTY;
	  String producttype , from, To; 
	  double price;
	  float weight ;
	  double Tax =0;
	
	public void productdetails() {
		 
		  Scanner sc = new Scanner(System.in);
	      System.out.println(" Enter the Product Id : ");
	      productid  = sc.nextInt();
	      System.out.println(" Enter the Product Quantity :");
	      QTY  = sc.nextInt();
	      System.out.println(" Enter the Product Type");
	      producttype  = sc.next();
	  
	      System.out.println("  Sender's Location :");
	      from  = sc.next();
	      System.out.println("  Reciever's Location :");
	      To  = sc.next();
	      
		  
	}
  public void billing() {
	
	
	Scanner sc = new Scanner(System.in);
  System.out.println(" Enter the product Weight");
  weight =  sc.nextFloat();
  if(weight > 200) {
	Tax = 50.00 +10.00 ;   
	System.out.println(" Product Weight is more than 200kg  You have Pay Extra " + " " + Tax + "rs");
	price = weight * Tax;
	System.out.println(" You have been charged"+ " " + price);
  }
 
  else if(weight <=200 && weight >=100 ) {
	Tax = 40.00 ;   
  	System.out.println(" Product Weight is Below  200kg Taxes Will be Charged" + " "+ Tax +"Rs");
  	price = weight * Tax;
  	System.out.println(" You have been charged"+ " " + price +"Rs");
	  
  }
  else if(weight <=100 &&  weight >=10 ) {
  	Tax = 30.00 ;   
    	System.out.println(" Product Weight is Below  50kg Taxes Will be Charged" + " "+ Tax + "Rs");
    	price = weight * Tax;
    	System.out.println(" You have been charged"+ " " + price +  " "+ " Rs");
  	  
    }
  else if(weight <=0  )
  {   
	  System.out.println("Enter the Valid input");
  }
  }
   public void bill() {
	   System.out.println(" ");
	   System.out.println("Shiping Bill");
	   System.out.println(" Enter the Product Id : "  + productid);
	   System.out.println(" Enter the Product Quantity :" + QTY);
	   System.out.println(" Enter the Product Type :" + producttype);
	   System.out.println(" Sender's Location :" +  from);
	   System.out.println(" Reciever's Location :" +  To);
	   System.out.println(" Enter the product Weight :"+ " " + weight + " " + "kg");
	   System.out.println(" You have been charged"+ " " + price + " Rs" + " " +"with" + " " + Tax +  " " +"Rs" + " "+ " As Tax" );
	   
   }

	public static void main(String[] args) {
		Shipping ob = new Shipping();
		ob.productdetails();
		ob.billing();
		ob.bill();
	

}
}