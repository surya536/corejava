package com.svkp.exceptions;

import java.util.Hashtable;
import java.util.Set;

public class NoSuchMethod {

	public static void main(String[] args) {
		Set exampleleSet = new Set();
		 
        Hashtable exampleTable = new Hashtable();
 
        exampleleSet.iterator().next();
        exampleTable.elements().nextElement();

	}

}
