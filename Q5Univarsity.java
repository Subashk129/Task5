package Task5;

import java.util.Scanner;

public class Q5Univarsity {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Marks: ");
		int marks = scanner.nextInt();
		
		if (marks > 100) {
			System.out.println("Invalid inputs");
		}else {
			char grade = calculateGrade(marks);
			System.out.println("Grade: "+grade);
		}
	}
	
	public static char calculateGrade(int marks) {
		
		if (marks == 100) {
			return 'S';
		}else if (marks <=99 && marks >= 90) {
			return 'A';	
		}else if (marks <=89 && marks >= 80) {
			return 'B';	
		}else if (marks <=79 && marks >= 70) {
			return 'C';
		}else if (marks <=69 && marks >= 60) {
			return 'D';
		}else if (marks <=59 && marks >= 50) {
			return 'E';
		}else {
			return 'F';
		}
	}

}
