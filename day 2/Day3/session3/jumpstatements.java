package session3;

public class jumpstatements {
    public static void main(String[] args) {
		int i = 1;
		//break statement
		while(i<10) {
			if(i==5) {
				break;
			}
			System.out.println(i);
			i++;
			
			
		   //continue statement
			while(i<10) {
				if(i==5) {
	                i++;
					continue;
				}
				System.out.println(i);
				i++;
		}
	 }
   }
}
