package com.example.Log.Log.domian;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
@SuppressWarnings("unused")
public class addFile { 
	
	//static ArrayList<String> listOfLines = new ArrayList<String>();
	public static void main(String[] args) throws IOException { 
		try{
	    		@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\User\\\\Desktop\\\\JAVA\\\\LogReader\\\\1.log"));
	    		String line = null;
	    		   int i=0;
	    		   while ((line = br.readLine()) != null) {
	    			   proccesLine(line);
	    		   }
	    		}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage() + "File not found !!");
	    	}
	    }
	
	public static void proccesLine(String line) {
		if(line==null)
			return;
		if(line.contains("Caused by:")) {
			//listOfLines.add(line);
			int i=line.indexOf("Caused by:");
			int firstL=line.indexOf("(", i);
			int lastL=line.indexOf(")", firstL);
			String temp=line.substring(firstL+1, lastL);
			Error.addNewError(temp);
		}
		//else System.out.println("No Errors found");
	}
	
//	public static void craetErrorFile(String appName,String coreCustom,String errorCode) {
//		try { 
//		      File errorFile = new File("C:\\Users\\User\\Desktop\\JAVA\\LogReader\\ErrorSummury.txt"); 
//		      if (errorFile.createNewFile()) { 
//		        System.out.println("File created: " + errorFile.getName()); 
//		      } else { 
//		        System.out.println("File already exists."); 
//		      } 
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace(); 
//		    }
//		
//	}
  }
