package full_stack_madhu;
import java.util.Scanner;
public class Errorex {
  
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		
		assert(age>0)&&(age>120); //Error condition
		System.out.println("The entered age is:"+age);
	}
}
