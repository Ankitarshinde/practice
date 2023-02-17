package demo;

public class Relational {

	public static void main(String[] args) {
		
		int num1 = 55;
		int num2 = 55;
		
       boolean decision = !(num1>num2); //NOT gate
       System.out.println(decision);
       
      int num4 = (num1>num2)? 99 :100;  //conditional operator
      System.out.println(num4);
		
      int num5 =~num4;
      System.out.println(num5);
		
	}

}
