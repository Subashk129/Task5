package Task5;

import java.util.Scanner;

public class Q6HotelTariff {

	public static void main(String[] args) {
		    
	        Scanner scanner = new Scanner(System.in);
	        
	        // Month number of room booking
	        System.out.println("Enter the Month from(1-12): ");
	        int month = scanner.nextInt();
	       
	        // Getting rent value from user based on type of room
	        System.out.println("Enter Rent Value: ");
	        float rent = scanner.nextFloat();
	        
	        // Room booking days     
	        System.out.println("Enter days ");
	        int days = scanner.nextInt();
	        
	        scanner.close();
	        
	        hotelTariff(month, rent, days); 
	    }
	    
	      public static void hotelTariff(int month, float rent, int days){
	        float tariff = 0;
	        switch(month){
	            case 4:
	            case 5:
	            case 6:
	            case 11:
	            case 12:
	            // 20% peak season charges
	            	tariff = rent * days * 1.2f;
	            	break;    
	           default: 
	            	tariff = rent * days;                	
	        }
	        //printing the total tariff 
	        System.out.println("Hotel Tariff is: "+ String.format("%.2f",tariff));
	      
	      }
	}
