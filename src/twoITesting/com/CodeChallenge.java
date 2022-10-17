package twoITesting.com;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.stream.Collectors;

	public class CodeChallenge {
		
		/**** Scenarios/Assumptions ***
		 * Let user input 10 numbers ranging from 1 to 100
		 * Read 10 numbers ranging from 1 to 100
		 * Display error when more than 10 values entered by user
		 * Display error when values entered not between 1 and 100 by user
		 * Display output after removing the duplicate and in reverse order
		*/

		public static List<Integer> filter(List<Integer> numbers) {
			//Set object used for removing duplicates
			Set<Integer> uniqueNumbers = new HashSet<>(numbers);
			//Streams used for sorting in reverse order
			return uniqueNumbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		}
		
		public static void main(String[] args) {
					
			// Take the input from the user using scanner 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter 10 numbers between 1 to 100 (space between each number)");
	        
	        //Validate the user input and throw error when input not matching criteria
	        List<Integer> numbers = new ArrayList<>();
	        for (int i = 0; i < 10; i++) {
	        	int number = scanner.nextInt();
	        	if (number < 1 || number > 100 ) {
	        		System.out.println("*** Input is not correct - Please re-run the program again and input valid data ***");
	        		return;
	        	}
	        	numbers.add(number);
	        }
	        
	        if (numbers.size() != 10) {
	        	System.out.println("*** Error - 10 numbers must be entered ***");
	        	return;
	        }
	        
	        scanner.close();
	        //Display the output i.e. no duplicates and in reverse order
	        System.out.println("*** Output after removing duplicates and in reverse order ***");
	        System.out.println(filter(numbers));

		}
		
	}

		

