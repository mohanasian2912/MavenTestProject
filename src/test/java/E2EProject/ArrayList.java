package E2EProject;

import java.util.Collections;
import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	      //ArrayList<String> alist=new ArrayList<String>(); 
	      
	      java.util.ArrayList<String> alist = new java.util.ArrayList<String>();
	      alist.add("Amit");
	      alist.add("Sumit");
	      alist.add("Rahul");
	      alist.add("Karan");
	      alist.add("Mohan");
	      alist.add("Shri");
	      alist.add(2, "Ravi");
	      alist.remove(0);
	      alist.add(0, "Amit");
	      alist.set(2, "Ajay");
	      
	      Collections.sort(alist);
	      
	      System.out.println(alist.size());
	      for(String str:alist)
	      {
	    	  System.out.println(str);
	      }


	      LinkedList<String> abc = new LinkedList<String>();
	      abc.add("Quikr");
	      abc.add("OLX");
	      abc.add("Flipkart");
	      abc.add("Amazon");
	      abc.add("Paytm");
	      
	      System.out.println(abc.indexOf("OLX"));
	      
	      for(String bcd: abc)
	      {
	    	  System.out.println(bcd);
	      }

	}

}
