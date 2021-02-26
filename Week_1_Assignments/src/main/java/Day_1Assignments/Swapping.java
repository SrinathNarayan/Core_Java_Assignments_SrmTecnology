package Day_1Assignments;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Values of a and b");
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("Before swapping" +" " +"a ="+" "+a+" "+ "b =" +" " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping"  +" " +"a ="+ " " +a+" "+ "b =" +" " + b);

	}

	}


