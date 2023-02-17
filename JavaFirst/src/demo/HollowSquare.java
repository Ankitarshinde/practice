package demo;

public class HollowSquare {

	public static void main(String[] args) {
		
	   for(int i=0;i<5;i++) {             //inner loop
		   for(int j=0;j<5;j++) {         //outer loop
			   if(i == 0||i == 5-1) {     //print only star in first and last row
				   System.out.print("*");
			   }
			   else {                     //print star only first and last position row
				   if(j == 0||j == 5-1) {
					   System.out.print("*");
				   }
				   System.out.print(" ");
			   }
			   
		   }
		   System.out.println();
	   }
	}

}
