package com.ruth.javaday1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		  List<Integer> arrlist = new ArrayList<>();
		    arrlist.add(1);
		    arrlist.add(2);
		    arrlist.add(3);
		    arrlist.add(4);
		    arrlist.add(5);
		    arrlist.add(6);
		    
		    MyList  mylist= new MyList();
		    
	
		    System.out.println("The middle element is " + mylist.isMiddleElement(arrlist));
		    
		    
		    List<String> animals = new ArrayList<>();
			animals.add("bat");
			animals.add("owl");
			animals.add("bat");
			animals.add("bat");
			
			Count mycount= new Count();
			System.out.println("The frequency of bat is " + mycount.isRepeat("bat", animals));
			
		
	}
	
}
		



