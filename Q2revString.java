package Task5;

import java.util.Scanner;

public class Q2revString {

	public static void main(String[] args) {
		
		//String From user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		//for input
		String input = sc.nextLine();
		
		char[] inputArray = input.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		//using for loop to reverse the string
		for(int i=inputArray.length-1; i>=0; i--) {
			
			sb.append(inputArray[i]);
		}
		//printing in new line
		System.out.println("Reversed String: "+sb.toString());;
		

	}

}
