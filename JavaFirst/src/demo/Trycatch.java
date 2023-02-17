package demo;

public class Trycatch {
	
public static int retInt() {
	int a =100;
	try {
		a = a/0;
		return a;
	
	}catch(ArithmeticException e) {
		
		System.out.println("Catch called");
		System.out.println(e);
		return a;
	}finally{
		a =5000;
		System.out.println("finally called");
		return a;
	}
}
	public static void main(String[] args) {
		System.out.println(retInt());
		
		
		
	}

}
