package session5;

public class cat extends Animal{
      
	public void action() {
		System.out.println("cat plays with mouse");
	}
	
	/***
   public static void main(String[] args) {
       Animal an = new Dog();
       Animal an1 = new cat();
       
       an.eat();
       an1.
   */

   public static void main(String[] args) {
	   cat ct = new cat();
	   ct.action();
	   ct.eat();
	   
	   Dog dg = new Dog();
	   dg.sound();
	   dg.eat();
//ct.sound();//	   
	   
	   




}

 
}
