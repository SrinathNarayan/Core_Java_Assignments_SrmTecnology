package Day_1Assignments;

import java.util.Scanner;

public class RemoveSpaces {

	
		public static void main(String[] args) {
			String line = "";
			Scanner sc =  new Scanner(System.in);
			System.out.println("Enter the line:");
			line= sc.nextLine();
			
			System.out.println(line.replaceAll(" ",""));
		}

	}


