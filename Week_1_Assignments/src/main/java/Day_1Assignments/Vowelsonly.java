package Day_1Assignments;

import java.util.Scanner;

public class Vowelsonly {

	public static void main(String[] args) {
		String sentence = " ";
		int Vowels = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		sentence = sc.nextLine();
		

		sentence = sentence.toLowerCase();
		for (int i = 0; i < sentence.length(); ++i) {
			char ch = sentence.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++Vowels;
			}
		}
		System.out.print("VOWELS :" + Vowels);

	}

	}

