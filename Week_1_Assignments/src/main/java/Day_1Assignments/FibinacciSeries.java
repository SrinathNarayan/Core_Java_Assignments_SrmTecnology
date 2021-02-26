package Day_1Assignments;

import java.util.Scanner;

public class FibinacciSeries {

	public static void main(String[] args) {
		int maximum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		maximum= sc.nextInt();
		int privious = 0;
		int next=1;
		 System.out.println(" The Fibonacci series of the given number"+  " " + maximum);
		 
		 for (int i= 0; i<=maximum; ++i) {
			 
			 System.out.println(privious);
			 int sum =  privious + next;
				privious = next;
				next = sum;
		 }

	}

}
