package demo;

public class StringDemo3 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("cooking");
		
		str.append("emerging");
		System.out.println(str);
		
		str.insert(7,"Technology");
		System.out.println(str);
		
		str.replace(8,16,"IoT");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		System.out.println(str.capacity());
	}

}
