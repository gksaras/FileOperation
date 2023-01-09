package org.file.operation.task;

import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class FileOprations {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("D:\\Java");
		//boolean mkdir = f1.mkdir();
		//System.out.println(mkdir);
		if(f1.exists()) {
			System.out.println(f1.getName()+" => "+"created successfully");
		}
		
		
		File f2 = new File("D:\\Java\\File Operations");
		//boolean mkdirs = f2.mkdirs();
		//System.out.println(mkdirs);
		if(f2.exists()) {
			System.out.println(f2.getName()+" => "+"created successfully");
		}

		
		File f3 = new File("D:\\Java\\File Operations\\Sample.txt");
		//boolean createNewFile = f3.createNewFile();
		//System.out.println(createNewFile);
		if(f3.exists()) {
			System.out.println(f3.getName()+" => "+"created successfully");
		}
		
/*		boolean canExecute = f3.canExecute();
		System.out.println(canExecute);
		
		boolean canRead = f3.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f3.canWrite();
		System.out.println(canWrite);    */
		
		// using enhanced for loop
 /*		String[] l = f1.list();
		for (String s : l) {
			System.out.println(s);
		}
		
		File[] f = f1.listFiles();
		for (File file : f) {
			System.out.println(file);    
		}	*/
		
		// iterate using for loop
		String[] list = f1.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
		}
		
		File[] listFiles = f1.listFiles();
		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i].toString());
		}
		
		
/*		FileWriter fwrite = new FileWriter("D:\\Java\\File Operations\\Sample.txt");
		fwrite.write("File is a predefined class under java.io package"
				+"\nIt is used to perform file related operations like read, write and append"
				+"\nHere path name act as argument"+"\nmkdir is used to create single folder"
				+"\nmkdirs is used to create multiple folders"
				+"\ncreateNewFile is used to create txt,png and pdf format files"
				+"\ncanRead is used to check the file readable or not"
				+"\ncanWrite is used to check the file writable or not");
		fwrite.close();
		

		
		Scanner file = new Scanner(new FileInputStream("D:\\Java\\File Operations\\Sample.txt"));
		int lineCount = 0;
		while(file.hasNextLine()) {
			String line = file.nextLine();
			lineCount++;
			// to print the odd lines 
		//	if(lineCount == 1|lineCount == 3|lineCount == 5|lineCount == 7|lineCount == 9) {
			
			// to print last 5 lines
			if(lineCount > 3)	{
			System.out.println(line);
			}
		}
		//System.out.println();
		
		System.out.println("Total Lines(rows) = "+lineCount);
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to search and check whether it is present or not");
		String word=sc.next();
		
		int count = 0;
		boolean flag = false;
		Scanner f= new Scanner(new FileInputStream("D:\\Java\\File Operations\\Sample.txt"));
		while(f.hasNextLine()) {
			String line = f.nextLine();
			//System.out.println(line);
			if(line.indexOf(word) != -1) {
				flag = true;
				count++;
				 System.out.println(line);
			}
		}
		if(flag) {
			  System.out.println("File contains the specified word");
			 
		         System.out.println("Number of occurrences is = "+count);
		        
		      } else {
		         System.out.println("File does not contain the specified word");
		      }	*/
	}
}
