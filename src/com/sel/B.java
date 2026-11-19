package com.sel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B  {
	

	public static void main(String[] args) {
	 
		List<String> l = new ArrayList<>();
		l.add("Name");
		l.add("Mobile");
		l.add("Device");
		System.out.println(l);
		
		for (String str : l) {
			System.out.println(str);
			
		}
		
	}

	
}
