package session6;

public class Exceptionex1 {
	
	   
		String str1 = "hello";//instance variable
		
		public void name() {
			try {
				int i = Integer.parseInt(str1);
				System.out.println("the value of converted string:"+str1);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		public static void main(String[] args) {
			Exceptionex1 ee = new Exceptionex1();
			ee.name();
		}
	}



