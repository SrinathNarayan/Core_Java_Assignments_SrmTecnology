package Day_5_Assignments;

import java.io.File;

public class HashCode {

	public static void main(String[] args) {
		
		
		 File student = null;
	      int Hcode;
	      boolean File = false;
	      
	      try {
	         
	    	  student = new File("C:\\Users\\Trainee\\git\\repository2\\Week_1_Assignments\\Studentinput");
	         Hcode = student.hashCode();
	         File = student.exists();
	         if(File) {
	         
	         
	            System.out.print("The hash code for this abstract pathname: "+Hcode);
	           
	         }
	         
	      } catch(Exception e) {
	         System.out.println("An Unidentfied Error Occur");
	         e.printStackTrace();
	      }
	   }

	}


