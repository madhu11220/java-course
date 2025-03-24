package session5;

public class Wrapper {
  
  public static void main(String[] args) {
	  
	  //Converting Primitive to Wrapper Class
	  int a = Integer.valueOf(50);
	  
	  Integer intobj = 50;//Equivalent  to Integer,valueof(50);

      Character charobj = 'a';
      
      Double dobj = 25.35478;
      
      
      System.out.println(a);
     System.out.println(intobj);
     System.out.println(charobj);
     System.out.println(dobj);
  System.out.println("------------------------------");
  
  
  //Converting Wrapper class to Primitive
  int value1 = intobj;
  char value2 = charobj;
  double value3 = dobj;
  
  System.out.println(value1);
  System.out.println(value2);
  System.out.println(value3);
  
  System.out.println("------------------------------");
  
  
  //Using utility method from wrapper class
  int parseInt = Integer.parseInt("123");
  double parseDouble = Double.parseDouble("25.34567");
  boolean parseBoolean = Boolean.parseBoolean("true");
  
  
  
  System.out.println(parseInt);
  System.out.println(parseDouble);
  System.out.println(parseBoolean);
  }
}
