package demo;

import java.util.Arrays;

public class Stringdemo1 {

	public static void main(String[] args) {
		String num1 = "Edubridge";
		String num2 = "India";
		char[]dest=new char[14];
		String num3 = num1.concat(num2);
		
		System.out.println(num3);
		System.out.println("Length :"+num3.length());
		num3.getChars(0, 14, dest, 0);
		System.out.println(Arrays.toString(dest));

		 String upper = num1.toUpperCase();
		 System.out.println(upper);
		 String lower = num1.toLowerCase();
		 System.out.println(lower);
		 
		 StringBuffer s1 = new StringBuffer(num1);
		 
		  System.out.println( "Reverse:"+s1.reverse());
	}

}
