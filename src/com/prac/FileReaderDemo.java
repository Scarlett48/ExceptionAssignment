package com.prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String args[]) throws IOException {
		FileReaderDemo cobj = new FileReaderDemo();
		File fobj = new File("inoutdemo.txt");
		cobj.readFromFile(fobj);
	}
	
	public void readFromFile(File fobj) throws IOException {
		FileReader fr = new FileReader(fobj);
		int i;
		while((i=fr.read())!=-1)
		System.out.print((char)i);
		fr.close();
	}
}
