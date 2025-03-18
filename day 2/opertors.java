package programs;

public class opertors {
	
		public static void main(String[] args) {
			int a =18, b = 7;
			//arithmetic
			System.out.println("addition:"+(a+b));
			System.out.println("subtraction:"+(a-b));
			System.out.println("multiplication:"+(a*b));
			
			//relation
			System.out.println("equal to:"+(a==b));
			System.out.println("not equal:"+(a!=b));
			System.out.println("greater then:"+(a>b));
			System.out.println("less than equal to");
			
			//logical
			boolean condition1 = true, condition2 = false;
			System.out.println("logical AND:"+(condition1 && condition2));
			System.out.println("logical OR:"+(condition1 || condition2));
			System.out.println("logical NOR:"+(!condition1));
			
			
			//unary
			System.out.println("unary negation:"+(~a));
			System.out.println("unary negation:"+(~b));
			System.out.println("post increment:"+(a++));
			System.out.println("post decrement:"+(b--));
			
			//assignment
			a+=3;
			System.out.println("+=:"+a);
			
			//Ternary ? :
			String res =(a>b)?"a is greater" : "b is greater ";
			System.out.println("result:" +res);
			
			
			//bitwise
			/***
			 * AND-->&
			 * OR-->|
			 * NOT-->~
			 * XOR-->^
			 */ 
			 
			
			
			
		}
	}


