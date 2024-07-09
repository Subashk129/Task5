package Task5;

public class Q4pattern {

	public static void main(String[] args) {
		
		//outer loop for row
		for(int i=0; i<5; i++) {
		
		//Inner loop for colounms
			for(int j=0; j<5; j++) {
				
			 //if statement for * pattern
				if(i==j || i+j==5-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
