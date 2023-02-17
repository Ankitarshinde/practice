package demo;

class Demonew
{
	int one = 11;
	int two = 22;
	
	 void add()
	{
		System.out.println("Addition :" +(one+two));
	}
}

public class classDemo {

	public static void main(String[] args) {
      
		Demonew d1 =new Demonew();
		
		System.out.println(d1.one);
		System.out.println(d1.two);

		d1.add();
		
	}

}
