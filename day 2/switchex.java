package programs;

import java.util.Scanner;

public class switchex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Select an operation:");
	
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	
	System.out.println("Enter ur choice(1/2/3/4):");
	int choice = sc.nextInt();
	
	System.out.println("Enter first number:");
	double num1 = sc.nextDouble();
	
	System.out.println("Enter second number:");
    double num2 = sc.nextDouble();
    
    
    double result;
    
    switch(choice) {
    case 1:
    	result = num1 +num2;
    	System.out.println("result:"+result);
    	break;
    
   case 2:
	result = num1 - num2;
	System.out.println("result:"+result);
	break;
	
   case 3:
   	result = num1 * num2;
   	System.out.println("result:"+result);
   	break;
   	
   case 4:
	   if(num2 !=0) {
	
   	result = num1 / num2;
   	System.out.println("result:"+result);
	   }else {
		   System.out.println("error:division by zero not allowed");
	   }
   	break;
   	default:
   		System.out.println("invalid choice select the correct choice");
   }
   }
}
    


