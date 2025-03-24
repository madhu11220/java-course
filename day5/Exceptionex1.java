package session5;

public class Exceptionex1 {
   
	String str1 = "hello";
	
	public void name() {
		try {
			int i = Integer.parseInt(str1);
			System.out.println("the value of converted string:"+str1);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Exceptionex1 ee = new Exceptionex1();
		ee.name();
	}
}
