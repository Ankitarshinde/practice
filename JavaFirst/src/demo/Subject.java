package demo;

class Marks           
{
	int physics,chemistry,biology;
	
}
public class Subject {

	public static void main(String[] args) {
	
       Marks m1 =new Marks();  
       Marks m2 =new Marks(); //object of marks
       m1.physics=88; m1.chemistry=78 ; m1.biology=90;
       m2.physics=98; m2.chemistry=68 ; m2.biology=40;
       System.out.println("Phy : " +m1.physics+" Chemistry :"+ m1.chemistry+" Bio : "+m1.biology);
       System.out.println("Phy : " +m2.physics+" Chemistry :"+ m2.chemistry+" Bio : "+m2.biology);
       
	}

}
