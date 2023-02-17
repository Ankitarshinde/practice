package demo;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> name =new HashSet<String>();
        name.add("Mark");
        name.add("tom");
         name.add("jack");
         name.add("juli");
         name.add("patrik");
         
        
         Iterator<String> itr = name.iterator();
         
         while(itr.hasNext())
        	 System.out.println(itr.next());
	}

}
