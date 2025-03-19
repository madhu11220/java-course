package session3;

public class arrays {
    public static void main(String[] args) {
	  String[] names = {"Sachin","virat kolhi","dhoni"};
	 
	  //Access all elements using for loop
	  for(int i =0; i<names.length;i++) {
		  System.out.println(names[i]);
	  }
	  //System.out.println(names[1]);
	  
	  
	  
	  
	  //multi-dimensional array
	  int[][] a = {{2,4}, {5,7} , {7,3} , {3,1}};
	  
	  for(int i = 0; i<a.length; i++) {
		  for(int j = 0; j<a[i].length; j++) {
			  System.out.print(a[i][j]);
		  }
		  System.out.println();
	  }
	  
	  for(int[] i : a) {
		  for(int[] j : a) {
			  System.out.println();
		  }
		  System.out.println();
	  }
	}
}
