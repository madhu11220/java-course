package session5;

public class AbstractEmployee1 extends AbstractEmployee{
   
	public void futureDesignation() {
		System.out.println("full Stack Developer");
	}
	
	
	public static void main(String[] args) {
		AbstractEmployee1 ae = new AbstractEmployee1();
	    ae.name();
	    ae.designation();
	    ae.futureDesignation();
	
	
	}
	
	
}
