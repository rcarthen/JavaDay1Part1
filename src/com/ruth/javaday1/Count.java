package com.ruth.javaday1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Count {

	public int isRepeat() {

		List<String> animals = new ArrayList<>();
		animals.add("bat");
		animals.add("owl");
		animals.add("bat");
		animals.add("bat");
		System.out.println("Freq of bat: " + Collections.frequency(animals, "bat"));
		return Collections.frequency(animals, "bat");

	}

}
