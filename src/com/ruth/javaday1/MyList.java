package com.ruth.javaday1;


import java.util.List;

public class  MyList {

	///purpose of the method is find middle element///return the index of the middle element (not the ans)///expectation print on the main///capture the value of the variable
	
   public int  isMiddleElement (List<Integer> arrlist) {

	    
	   
	   if (arrlist.isEmpty()){
		   
		   throw new IllegalArgumentException("Arraylist is Empty");
		   
	   }
	   
	   else
		   
	   {
		   
		   int middle= arrlist.size()/2;
		   
		   
		   ///to get the element of a specified position within the list
		   
		 return  arrlist.get(middle);
	   }
	   
   }
   
}
	    
	   


    
   

    
	

	
 
	




