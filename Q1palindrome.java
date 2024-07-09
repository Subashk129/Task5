package Task5;

public class Q1palindrome {

	public static void main(String[] args) {
		
		String str = "Hello world", rev = "";
		
		System.out.println("Original String: "+str);
		
		//Using for loop to reverse the string
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
		
		//If else statement to find palindrome
		if(str.equals(rev)) {
			System.out.println("This is Palindrome");;
		}else {
			System.out.println("This is Not palindrome");
		}	
	}
}
