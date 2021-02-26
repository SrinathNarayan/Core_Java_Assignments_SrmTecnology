package Day_1Assignments;

import java.util.Scanner;

public class PrimeorNotPrime {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num= sc. nextInt();
		
		
	    boolean isprime = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	      if (num % i == 0) {
	    	  isprime = false;
	        break;
	      }
	    }

	    if (!isprime)
	      System.out.println(num + " is a  prime number.");
	    else {
	      System.out.println(num + " is not a prime number.");
	  }

	}

}
