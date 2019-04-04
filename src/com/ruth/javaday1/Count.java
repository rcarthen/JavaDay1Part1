package com.ruth.javaday1;


import java.util.Collections;
import java.util.List;

public class Count {
	

	public int isRepeat(String animal,List<String> animals) {

		return Collections.frequency(animals, animal);
		 
		
	}

}
