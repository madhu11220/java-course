package session5;

public class AccessPerson {
      
	public static void main(String[] args) {
		//Original Person Object
		person originalperson = new person("Madhu",19);
        
	  //Copied Person Object
		person copiedperson = new person(originalperson);
		
		
		System.out.println("Original Person:");
		originalperson.displayInfo();
	
	   System.out.println("Copied Person:");
	   copiedperson.displayInfo();
	
	}
	

	
	
}
