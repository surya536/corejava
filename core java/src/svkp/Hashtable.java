package svkp;

import java.io.*;
import java.util.*;


public class Hashtable {

	public static void main(String[] args) {
		Hashtable ht1 = new Hashtable();
		Hashtable ht2 = new Hashtable();


		ht1.put(11, "Vijaya");
		ht1.put(24, "Pappu");
		ht1.put(33, "Satya");

		ht2.put(40, "Lilly");
		ht2.put(05, "Maahi");
		ht2.put(16, "Buddi");

		
		System.out.println("Student ID with Names : " + ht1);
		System.out.println("Student ID with Names : " + ht2);

	}

	private void put(int i, String string) {
		// TODO Auto-generated method stub
		
	}

}
