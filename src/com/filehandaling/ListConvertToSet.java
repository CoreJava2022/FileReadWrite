package com.filehandaling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListConvertToSet {

	List<String> myList;
	Set<String> setValue;

	public Set<String> listConvertSet() {

		BufferedReader bufferedReader = null;
		BufferedWriter bufferWriter = null;
		try {
			bufferWriter = new BufferedWriter(new FileWriter("SetOne.txt"));
			bufferedReader = new BufferedReader(new FileReader("List1.txt"));
			myList = new ArrayList<String>();
			String line = null;
			try {

				while ((line = bufferedReader.readLine()) != null) {
					myList.add(line);
				}
				  setValue = new HashSet<String>(myList); 
				  List<String> list1 = new ArrayList<String>(); 
				  list1.addAll(setValue); 
				  SortedSet<String> setList = new TreeSet<String>(setValue);
				  Iterator<String> itr = setList.iterator(); 
				  while (itr.hasNext()) { 
					 String s=itr.next();
					  bufferWriter.write(s + "\n");
					  System.out.println(s+"\n");
				 }
				

			} finally {
				bufferWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return setValue;
	}

	public Set<String> listToBreakdownSet() {

		BufferedReader bufferedReader = null;
		BufferedWriter bufferWriter = null;
		try {
			bufferWriter = new BufferedWriter(new FileWriter("SetTwo.txt"));
			bufferedReader = new BufferedReader(new FileReader("List2.txt"));
			myList = new ArrayList<String>();
			String line = null;
			try {

				while ((line = bufferedReader.readLine()) != null) {
					myList.add(line);
				}
				  setValue = new HashSet<String>(myList); 
					
					  List<String> list1 = new ArrayList<String>(); 
					  list1.addAll(setValue);
					  Iterator<String> itr = list1.iterator(); 
					  while (itr.hasNext()) {
					   bufferWriter.write(itr.next() + "\n"); 
					   
					 }
					 
//				  for(String s: setValue){
//					  bufferWriter.write(s+"\n");
//				  }

			} finally {
				bufferWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return setValue;
	}
public Set<String> listToSetYear(){
	BufferedReader bufferedReader = null;
	BufferedWriter bufferWriter = null;
	try {
		 bufferWriter = new BufferedWriter(new FileWriter("SetThree.txt"));
		 bufferedReader = new BufferedReader(new FileReader("List3.txt"));
		 String line=null;
		 try {
			 while((line=bufferedReader.readLine())!=null) {
				myList.add(line); 
			 }
			 setValue = new HashSet<String>(myList);
			 for(String s: setValue){
				 bufferWriter.write(s+"\n");
			 }
		}finally{
			bufferWriter.close();
		}
		 
	} catch (IOException e) {
		e.printStackTrace();
	}
	return setValue;
}

public Set<String> listToSetRDValue(){
	BufferedReader bufferedReader = null;
	BufferedWriter bufferWriter = null;
	try {
		 bufferWriter = new BufferedWriter(new FileWriter("SetFour.txt"));
		 bufferedReader = new BufferedReader(new FileReader("List4.txt"));
		 String line=null;
		 try {
			 while((line=bufferedReader.readLine())!=null) {
				myList.add(line); 
			 }
			 setValue = new HashSet<String>(myList);
			 for(String s: setValue){
				 bufferWriter.write(s+"\n");
			 }
		}finally{
			bufferWriter.close();
		}
		 
	} catch (IOException e) {
		e.printStackTrace();
	}
	return setValue;
}
public Set<String> listToSetStatus(){
	BufferedReader bufferedReader = null;
	BufferedWriter bufferWriter = null;
	try {
		 bufferWriter = new BufferedWriter(new FileWriter("SetFive.txt"));
		 bufferedReader = new BufferedReader(new FileReader("List5.txt"));
		 String line=null;
		 try {
			 while((line=bufferedReader.readLine())!=null) {
				myList.add(line); 
			 }
			 setValue = new HashSet<String>(myList);
			 List<String> list1 = new ArrayList<String>(); 
			  list1.addAll(setValue);
			 Iterator<String> itr = list1.iterator();
			 while(itr.hasNext()){
				 bufferWriter.write(itr.next() + "\n"); 
				// System.out.println(itr.next()+"\n");
			 }
			 
//			 for(String s: setValue){
//				 bufferWriter.write(s+"\n");
//			 }
		}finally{
			bufferWriter.close();
		}
		 
	} catch (IOException e) {
		e.printStackTrace();
	}
	return setValue;
}
public Set<String> listToSetFootnotes(){
	BufferedReader bufferedReader = null;
	BufferedWriter bufferWriter = null;
	try {
		 bufferWriter = new BufferedWriter(new FileWriter("SetSix.txt"));
		 bufferedReader = new BufferedReader(new FileReader("List6.txt"));
		 String line=null;
		 try {
			 while((line=bufferedReader.readLine())!=null) {
				myList.add(line); 
			 }
			 setValue = new HashSet<String>(myList);
			 for(String s: setValue){
				 bufferWriter.write(s+"\n");
			 }
		}finally{
			bufferWriter.close();
		}
		 
	} catch (IOException e) {
		e.printStackTrace();
	}
	return setValue;
}
public Set<String> listToSetUnit_for_TSM_and_CSV(){
	BufferedReader bufferedReader = null;
	BufferedWriter bufferWriter = null;
	try {
		 bufferWriter = new BufferedWriter(new FileWriter("SetSeven.txt"));
		 bufferedReader = new BufferedReader(new FileReader("List7.txt"));
		 String line=null;
		 try {
			 while((line=bufferedReader.readLine())!=null) {
				myList.add(line); 
			 }
			 setValue = new HashSet<String>(myList);
			 for(String s: setValue){
				 bufferWriter.write(s+"\n");
			 }
		}finally{
			bufferWriter.close();
		}
		 
	} catch (IOException e) {
		e.printStackTrace();
	}
	return setValue;
}

	public static void main(String[] args) {

		ListConvertToSet listConvertToSet = new ListConvertToSet();
		listConvertToSet.listConvertSet();
		listConvertToSet.listToBreakdownSet();
		listConvertToSet.listToSetYear();
		listConvertToSet.listToSetFootnotes();
		listConvertToSet.listToSetRDValue();
		listConvertToSet.listToSetStatus();
		listConvertToSet.listToSetYear();
		listConvertToSet.listToSetUnit_for_TSM_and_CSV();
	}

}