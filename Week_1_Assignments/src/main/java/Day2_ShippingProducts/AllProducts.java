package Day2_ShippingProducts;

import Day2_ShippingProducts.ClothingProducts;
import Day2_ShippingProducts.FootwareProduct;
import Day2_ShippingProducts.MobileProducts;
import Day2_ShippingProducts.TvProduct;

public class AllProducts {
	static TvProduct tv;	
	static MobileProducts mobiles;
	static ClothingProducts cloth;
	static FootwareProduct foot;


	public void tvorder() {
		tv = new TvProduct(12453,65,130000,"LG","Android");
		
		tv.showTvProduct();
		
	}

	public void mobileorder() {
		mobiles = new MobileProducts(1234587,30000,"SAMSUNG","Android");
		mobiles.showMobiledetails();
	}

	public void clothorder() {
		cloth = new ClothingProducts(23654,28,13000,"Nike"," Hoddie"); 
		cloth.productdetails();
	}
	public void footorder() {
		foot = new FootwareProduct(78945,28,10000,"Puma"," shoes"); 
		foot.productdetails();
	}

	public void tvate() {

	tv.tvprice();
	}
	public void mobilerate() {
		mobiles.mobileprice();
	}
	public void clothrate() {
		cloth.clothprice();
	}
	public void footrate() {
		foot.footprice();
	}


}
