package Day_1Assignments;

import java.util.Scanner;

public class OddInteger {

	public static void main(String[] args) {
		System.out.println("Enter the Numbers");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		 
		for(int i=0;i<arr.length;i++){  
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++){  
		if(arr[i]%2!=0){ 
		System.out.println("Odd Numbers are :" + " " + arr[i]);  
		}  
		}
		

	}

}
