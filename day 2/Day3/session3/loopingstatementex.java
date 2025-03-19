package session3;

import java.util.Scanner;

public class loopingstatementex {
public static void main(String[] args) {
	

	int i = 18;
	
	// while loop
	while(i<40) {
		System.out.println("value of i:"+i);
		i++;
		
	}
	System.out.println("final value of i:"+i);
	

	
	//do-while loop
	do {
		System.out.println("value of i:"+i);
		i--;
	}while(i>=7);
	System.out.println("final of i:"+i);
	 
	
	//for loop
	for(i= 18;i<=50;i++) 
	{
		System.out.println("The value is:"+i);
		
	}
	System.out.println("final value is:"+i);
	
	//nested-for loop
	//square pattern printing
	for(int a = 1; a <=4;a++) {//a =1
		for(int b= 1; b<=4;b++){ //b=1 to 4 //4 times iteration happens
			System.out.print(a+" "+b);
			}
		System.out.println();
	}
	
	
	//trianlge pattern printing

	for(int a = 1; a <=4;a++) {
		for(int b= 1; b<a+1;b++){ 
			System.out.print(b+" ");
			}
		System.out.println();
	}
	
	
	//rows
	int num = 4;
	for( i = 0; i <=num;i++) {
		//for(int j =1;j>=1; j--) 
		for(int j= 1; j<=num-i;j++){ 
			System.out.print("* ");
			}
		System.out.println();
		

		
		
		
		//diamond pattern

				Scanner sc = new Scanner(System.in);

				

				System.out.println("Enter no .of rows : ");

				int rows = sc.nextInt();

				

				//top half of the diamond

				for(int p=1;p<=rows;p++)

				{

					//leading space

					for(int q=p;q<rows;q++)

					{

						System.out.print(" ");

					}

					//print *

					for(int r=1;r<=(2*p-1);r++)

					{

						System.out.print("*");

					}	

					System.out.println();

				}

				

				//bottom half of the diamond

						for(int p=rows-1;p>=2;p--)

						{

							//leading space

							for(int q=rows;q>p;q--)

							{

								System.out.print(" ");

							}

							//print *

							for(int r=1;r<=(2*p-1);r++)

							{

								System.out.print("*");

							}	

							System.out.println();

						}
		
    
		
	}
}
}






