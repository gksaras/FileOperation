package org.file.operation.task;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Sample {
	 
	public static void main(String[] args) throws IOException {
		
		System.out.println("File Operations");
		
		// To create a directory using mkdir
		File f1 = new File("D:\\File");
		boolean mkdir = f1.mkdir();
		System.out.println(mkdir); 
		if(f1.exists()) {
			System.out.println("Directory Created Successfully");
		} 
		
		// To create directories using mkdirs
		File f2 = new File("D:\\File\\Write");
		boolean mkdirs = f2.mkdirs();
		System.out.println(mkdirs);
		if(f2.exists()) {
			System.out.println("Directories Created Successfully");
		}
		
		// To  create a newfile format(txt,png,pdf) using createNewFile
		File f3 = new File("D:\\File\\Example.txt");
		boolean createNewFile1 = f3.createNewFile();
		System.out.println(createNewFile1);
		if(f3.exists()) {
			System.out.println("File Created Successfully");
		}
		
		// To Write text in the file created using FileUtils.write(file,"charSequence")
		FileUtils.write(f3, "File Operation is a class present in java.io package\n"); 
		FileUtils.write(f3, "It is to create,write,read and append\n", true); // append=true - joins
		FileUtils.write(f3, "FileUtils is a static class present in commons.io pkg\n", false); //append=false - overrides
		
		// To copy the content of one file and paste in another new file using FileUtils.copyFile(src,dest)
		File f4 = new File("D:\\File\\Notes.txt");
		boolean createNewFile2 = f4.createNewFile();
		System.out.println(createNewFile2);
		if (f4.exists()) {
			System.out.println("File Created Successfully");
		}
		FileUtils.copyFile(f3, f4);
		System.out.println();
		
		// To read the File from get{print) the content
		List<String> readLines = FileUtils.readLines(f4);
		// using for loop
		for (int i = 0; i < readLines.size(); i++) {
			String string = readLines.get(i);
			System.out.println(string);
		}
		System.out.println();
		// using enhanced for loop
		for (String eachLine : readLines) {
			System.out.println(eachLine);
		}
		System.out.println();
		
		// to iterate the folder and files created
		File[] listFiles = f1.listFiles();
		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i].toString());
		}
		
	}	
}
