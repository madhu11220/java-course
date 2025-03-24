package session5;

public class person {
        private String name;
        private int age;
        
        
        //Regular Constructor
        public person(String name,int age) {
        	this.name = name;
        	this.age = age;
        }
        	
        
        //Copy Construcor
        public person(person other) {
        	this.name = other.name;
        	this.age = other.age;
        }
			
        
       public String getName() {
    	   return name;
       }
       
       
       public int getAge() {
    	   return age;
       }
       
        //Method to display person details
        public void displayInfo() {
        	System.out.println( "Name: "+name+ "Age:" +age );
        }
}
               
