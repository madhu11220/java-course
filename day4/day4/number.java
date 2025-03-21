package day4;

import java.util.Scanner;

public class number {
	public static void main(String[] args) {
		
		//1.find greatest number in a,b,c
		/***
		int a,b,c;
		 
		  Scanner sc =  new Scanner(System.in);
		System.out.println("value of a:");
		a = sc.nextInt();
		System.out.println("value of b:");
		b = sc.nextInt();
		System.out.println("value of c:");
		c = sc.nextInt();
 
		if((a>b)&&(a>c)) {
		System.out.println("the value of "+a+"is greater" );
		}
		else if((b>c)&&(b>a)){
			System.out.println("the value of "+b+" is greater" );
		}
		else  {
			System.out.println("the value of "+c+" is greater");
		}
		*/
		
		
		
		//2.1st 20 odd numbers
		
		    
		        int count = 0;
		        int number = 1;

		        while (count < 20) {
		            System.out.println(number);
		            number += 2;  // Jump to the next odd number
		            count++;
		        }
		    
	
	
	
                   //3.convert value to either mile or kilometer based on your's choice
	
		        
		            
		                Scanner scanner = new Scanner(System.in);

		                // Asking the user for the conversion choice
		                System.out.println("Choose a conversion option:");
		                System.out.println("1. Kilometers to Miles");
		                System.out.println("2. Miles to Kilometers");
		                System.out.print("Enter your choice (1 or 2): ");
		                int choice = scanner.nextInt();

		                // Asking the user to input the value to be converted
		                System.out.print("Enter the value to convert: ");
		                double value = scanner.nextDouble();

		                // Perform the conversion based on user's choice
		                if (choice == 1) {
		                    // Kilometers to Miles conversion
		                    double miles = value * 0.621371;
		                    System.out.println(value + " kilometers is equal to " + miles + " miles.");
		                } else if (choice == 2) {
		                    // Miles to Kilometers conversion
		                    double kilometers = value / 0.621371;
		                    System.out.println(value + " miles is equal to " + kilometers + " kilometers.");
		                } else {
		                    System.out.println("Invalid choice. Please enter 1 or 2.");
		                }

		                scanner.close();
		            }
		        
}
	
	
	
	
		

	
		
       
	

