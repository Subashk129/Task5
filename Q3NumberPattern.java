package Task5;

public class Q3NumberPattern {

	public static void main(String[] args) {
		
		//outer loop for Rows
		int count=1;
		
		for(int i=1; i<=4; i++) {
			//inner loop for colounms
			for(int j=1; j<=i; j++,count++) {
				
				System.out.print(" "+count);
			}
			System.out.println();
		}

	}

}
