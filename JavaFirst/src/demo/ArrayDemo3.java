package demo;

public class ArrayDemo3 {

	public static void main(String[] args) {
        int decide[][]= {{11,22,33,44,55},{12,13,14,15,16}}; //two  dimensional array
         
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
            	System.out.print(" "+decide[i][j]);
            }
            System.out.println(" ");
        }
	}

}
