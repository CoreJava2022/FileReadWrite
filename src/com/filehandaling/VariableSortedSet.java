package com.filehandaling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class VariableSortedSet {
	SortedSet<String> s1;
	List<String> myList;
	public SortedSet<String> convert(){
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferWriter = null;
		try {
			bufferedReader = new  BufferedReader(new FileReader("List1.txt"));
			bufferWriter = new BufferedWriter(new FileWriter("sort.txt"));
			myList = new ArrayList<String>();
			String line;
			try {
				while((line=bufferedReader.readLine())!=null){
					myList.add(line);
				}
				s1=new TreeSet<String>(myList);
				
				
				 
				for(String s: s1){
				//boolean m=s.contains("External"); 
					if(s.contains("External")){
						bufferWriter.write(s+"\n");
					}
					else {
						//System.out.println("other are false value");
					}
				}	
			}finally{
				bufferWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return s1;	
	}
	
	public static void main(String[] args) {
		VariableSortedSet sortedSet = new VariableSortedSet();
		sortedSet.convert();
	}

}
