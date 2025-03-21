package day4;

public class constructoroverloading {
	
       private String empname;
       private int empid;
       private String location;
		
		public constructoroverloading(String empname ,int empid ,String location) {
			this.empname = empname;
			this.empid = empid;
			this.location = location;
		}
       
       public constructoroverloading(String empname ,String location ) {
    	   this(empname,0,location);//call invoke using this keyword
		}
          
       public constructoroverloading(String empname,int empid) {
    	   this(empname,empid,null);
       }
		
		public void displayInfo() {
			System.out.println("EmpName :" + this.empname );
            System.out.println("EmpId :"+this.empid);
            System.out.println("Location :"+this.location);
	}
	public static void main(String[]args) {
		constructoroverloading cox = new constructoroverloading("funny" ,18 ,"london");
		constructoroverloading cox1 = new constructoroverloading("madhu",0,"mtp");
		constructoroverloading cox2 = new constructoroverloading("sow",19);
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
	}
	
	
	
	
	
	

}
