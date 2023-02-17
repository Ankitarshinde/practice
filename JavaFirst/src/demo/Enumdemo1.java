package demo;

public class Enumdemo1 {
   public enum Day{
	   Monday(0),Tuesday(1),Wednesday(2),Thursday(3),Friday(4),Saturday(5),Sunday(6);
	   private int dayindex;
	   Day(int name){
		   this.dayindex=name;
	   }
	   int getDayIndex() {
	    	 return dayindex;
		  }
	public static void main(String[] args) {
	  System.out.println(Day.Thursday.getDayIndex());
	  System.out.println(Day.Tuesday);
	}
	  
   }
}

