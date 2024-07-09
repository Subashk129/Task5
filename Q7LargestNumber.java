package Task5;

import java.util.Scanner;

public class Q7LargestNumber {

	public static void main(String[] args) {
		//Getting numbers frm user
		Scanner scanner = new Scanner(System.in);
		//for loop condition 
		int num[] = new int[3];
		int i;
		for (i=0; i<3; i++) {
			System.out.println("Enter the Number:");
			num[i]= scanner.nextInt();	
		}
		//if else condition to check highest number
		if(num[0] > num[1] && num[0] > num[2]) {
			System.out.println("The highest value is: "+ num[0]);	
		}else if(num[1] > num[0] && num[1] > num[2]) {
			System.out.println("The Highest value is: "+ num[1]);
		}else if (num[2] > num[0] && num[2] > num[1]) {
			System.out.println("The Highest value is: "+ num[2]);
		}
	}
}
