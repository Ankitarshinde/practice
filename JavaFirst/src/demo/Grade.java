package demo;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int marks[],total=0,percentage=0;		
		marks =new int[5];     //Marks
		System.out.print("Physics Marks:");
		marks[0]=sc.nextInt();
		System.out.print("Chemistry marks:");
		marks[1]=sc.nextInt();
		System.out.print("Biology marks:");
		marks[2]=sc.nextInt();
	    System.out.print("English marks:");
	    marks[3]=sc.nextInt();
	    System.out.print("Mathematics marks:");
	    marks[4]=sc.nextInt();
	    
	    for(int i=0;i<5;i++) {
	    	total+=marks[i];
	    }
	     sc.close();
	    
	    System.out.println("Total Marks of subject"+":"+total);

       percentage=total/5;                           //percentage

	System.out.println("Percentage:"+percentage);
	
	System.out.print("The Student Grade is:");    // Grade
	
	if(percentage >=80) {                          
		System.out.print("A");
	}
	else if(percentage>60 && percentage<80) {
		System.out.print("B");
	}
	
	else if(percentage>=40 && percentage<60) {
		System.out.print("C");
	}
	else {
		System.out.print("Failed");
	}
	
}
}
