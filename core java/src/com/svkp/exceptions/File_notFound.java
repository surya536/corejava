package com.svkp.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_notFound {

	public static void main(String[] args) {
		try
		{
			File file = new File("D://sem2.file");
			FileReader fr = new FileReader("file");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not dose not exit");
		}
	}

}
