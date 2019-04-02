package com.ruth.javaday1;

import java.util.ArrayList;
import java.util.List;

public class  MyList {

	
   public boolean isListEmpty() {
	   
	   List<Integer> arrlist = new ArrayList<>();
	    arrlist.add(1);
	    arrlist.add(2);
	    arrlist.add(3);
	    arrlist.add(4);
	    arrlist.add(5);
	    arrlist.add(6);

	    
	   
	    boolean ans=arrlist.isEmpty();
	    if (ans==true) {
	    	throw new IllegalArgumentException("Arraylist is Empty");
	    }
	    
	    else {
//	    	System.out.println("Array List Not Empty");
	    	
	    	int middle = arrlist.size()/2;
	        System.out.println("Middle element = " + middle);
	    }
	    
	    return ans;
	    
	    
   }
}
	    
//    // to check if the ArrayList is Empty
//    boolean ans = arrlist.isEmpty(); 
//    if 
//    (ans == true) { 
//        System.out.println("The ArrayList is empty"); 
//    }
//    else
//    {
//        System.out.println("The ArrayList is not empty"); 
//        
//    }
//    
//    return ans;
////    
////   }
   

    
   

    
	

	
 
	




