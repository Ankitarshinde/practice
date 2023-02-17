package demo;

public class ArrayDemo2 {

	public static void main(String[] args) {
        int num1[]= {1,2,3,4,5};   //array initialized
        int counter = 0 ;   //counter variable
        
        while(counter<=4)
        {        
        	System.out.println(num1[counter]);
        	//0<=4 -->true
        	counter = counter+1;
        }
	}

}
