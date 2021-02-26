package Day_9_Assignments;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {
	
	 
	public static void main(String[] args) {
		List<Integer> numbers = List.of(121, 69, 13, 14, 16, 22, 41, 11, 150);
		System.out.println(" Stream Fuctions on Number List:");
		numbers.stream()
			.distinct() 
			.sorted() 
			.forEach(System.out::println); 
        

		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number) 
				.collect(Collectors.toList()); 
        System.out.println("\nSquared Numbers:\n"+squaredNumbers);

		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x % 2 == 0) 
				.collect(Collectors.toList());
        System.out.println("\nEven Numbers:\n"+evenNumbersOnly);
        

		List<Integer> oddNumbersOnly = numbers.stream()
				.filter(x -> x % 2 != 0) 
				.collect(Collectors.toList());
        System.out.println("\nOdd Numbers:\n"+oddNumbersOnly);
        
        int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
        System.out.println("\nGreatest No.:\n"+greatest);
        
        int lowest = numbers.stream()
				.reduce(Integer.MAX_VALUE, (x,y)-> x<y ? x:y);
        System.out.println("\nLowest No.:\n"+lowest);
System.out.println("");
        System.out.println("list Changed In Upper Case :" + upper(cities));
        System.out.println(" ");
        System.out.println("list Changed In Lower Case :" + lower(cities));
        
	}
		
	
	static List<String> cities = Arrays.asList("Java", "Android", "Angular", ".Net"," Sql");
	public static List<String> upper(List<String> listOfString) {
		return listOfString.stream() 
				.map(String::toUpperCase) 
				.collect(Collectors.toList());
		
}
	public static List<String> lower(List<String> listOfString) {
		return listOfString.stream() 
				.map(String::toLowerCase) 
				.collect(Collectors.toList());
}
}
