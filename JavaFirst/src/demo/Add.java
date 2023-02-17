package demo;

public class Add {

	public static void main(String[] args) {
		int num = 235;
		int reminder1=1;
		int reminder=0;
		int result = 0;
		while(num !=0)
		{
			 reminder = num%10;
		     reminder1 = num/10;
		     num = reminder1;
		   result = result+reminder;
		}
		
	
		System.out.println(result);
		}

	}


