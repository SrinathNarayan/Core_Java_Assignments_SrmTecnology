package Day_3Assignments;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		
			int size, i, j, temp;
		       int arr[] = new int[30];
		       Scanner scan = new Scanner(System.in);
			   System.out.println("Reversing The Array");
		       System.out.print("Enter Array of Size : ");
		       size = scan.nextInt();
			   
		       System.out.print("Enter Array Elements : ");
		       for(i=0; i<size; i++)
		       {
		           arr[i] = scan.nextInt();
		       }
			   
		       j = i - 1;     
		       i = 0;         
		       while(i<j)
		       {
		           temp = arr[i];
		           arr[i] = arr[j];
		           arr[j] = temp;
		           i++;
		           j--;
		       }
			   System.out.println( " ");
		       System.out.print("Now the Reverse of Array is : \n");
		       for(i=0; i<size; i++)
		       {
		           System.out.print(arr[i]+ "  ");
		       }       
	}


	}


