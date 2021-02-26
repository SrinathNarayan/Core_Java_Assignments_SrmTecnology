package Day4_Assignments;

public class Customers {
	int Id;
	String Customername , Productname;
	
	
public Customers(int id, String customername, String productname) {
		super();
		Id = id;
		Customername = customername;
		Productname = productname;
	}



public int getId() {
	return Id;
}



public void setId(int id) {
	Id = id;
}



public String getCustomername() {
	return Customername;
}



public void setCustomername(String customername) {
	Customername = customername;
}



public String getProductname() {
	return Productname;
}



public void setProductname(String productname) {
	Productname = productname;
}


@Override


public String toString() {
	return "ID :" + " " +this.Id+ " " + "Customername:" + " " + " " + this.Customername + " " + "ProductName: " + " " + this.Productname + "]";
	
}
}
