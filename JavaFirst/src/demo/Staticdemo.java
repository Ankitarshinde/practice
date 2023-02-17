package demo;

class Employee
{
	static int id;
	static String name = "Amar";
}

public class Staticdemo {

	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.id=101;
		System.out.println("Id :"+emp.id+" name: "+emp.name);
	}

}
