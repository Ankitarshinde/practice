package demo;

public class IfElseDemo {

	public static void main(String[] args) {
		double percentage =65.0;
		if (percentage>=70.0)
			System.out.println("First grade");
	
	else {
		if(percentage>=60.0 && percentage<70.0)
			System.out.println("Second grade");
		else {
			if(percentage>=50.0 && percentage<60.0)
				System.out.println("Third Grade");
			else
				System.out.print("Fail");
		}
	}
	}
}
