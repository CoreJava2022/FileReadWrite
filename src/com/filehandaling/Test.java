package com.filehandaling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	List<String> list;
	Set<String> setValue;
	public Set<String> convertedFromList(){
		List<String> str=listVariable();
		setValue=new HashSet<String>(str);
		FileWriter filewriter = null;
		BufferedReader bufferedReader=null;
		String line=null;
		
			try {
				filewriter=new FileWriter("Set1.txt");
				try {
					for(String i :setValue ) {
							filewriter.write(i+"\n");
						}
					
				}catch(IOException e) {
					e.printStackTrace();
				}
							
			} 
		    catch(IOException e){
			      e.printStackTrace();
		    }finally{
		    	try {
		    		filewriter.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		  }
		
		return setValue;	
	}
	public List<String> listVariable(){
		
		 File file= new File("List1.txt");
		 
		 try{
			 FileReader fileReader = new FileReader(file);
		     BufferedReader reader = new BufferedReader(fileReader);
		     String line;
		      list = new  ArrayList<String>();
		     while((line= reader.readLine()) != null){
		         list.add(line); 
		     }
		     }catch(IOException e){
		    	 e.printStackTrace();
		    	 }
		 return list;
		
	}
	
	public static void main(String[] args) {
		Test test= new Test();
		
		test.convertedFromList();
	}

}
