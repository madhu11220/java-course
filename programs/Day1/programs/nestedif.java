package programs;

import java.util.Scanner;

public class nestedif {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter ur age:");
	int age = sc.nextInt();
	
	System.out.println("Enter ur weight;");
	int weight = sc.nextInt();
	
	if(age>20) {
		 if(weight>50) {
			 System.out.println("age and weight are satisfied can donate blood");
			 
		 }else {
			 System.out.println("under weight cannot donate blood");
		 }
	}else {
		System.out.println("age is not satisfied can donate blood");
	}
		
	
	
}
}
