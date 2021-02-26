package Day_1Assignments;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		String givenString, reverseString ="";
		System.out.println("Enter the String");
		Scanner sc = new  Scanner(System.in);
		givenString= sc.nextLine();
		int len= givenString.length();
		for( int i= len-1;i>=0;i--) {
			reverseString= reverseString +givenString.charAt(i);
		
		}
		 System.out.println(reverseString);
		

	}

}
