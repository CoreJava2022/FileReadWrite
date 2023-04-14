package com.filehandaling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// regular example
public class CsvReadFile {
	Survey survey;
	String[] data;
	public List<Survey> readCsvFile(File file){
		
		BufferedReader bufferedReader = null;
		List<Survey> lines = new ArrayList<Survey>();
		try{
			bufferedReader = new BufferedReader(new FileReader(file));
			
			String line=null;
			try{
				while ((line = bufferedReader.readLine()) != null) {
					data= line.split(",");
					try {
						survey = new Survey(); 
						
						survey.setVariable(data[0]);
						survey.setBreakdown(data[1]);
						survey.setBreakdown_category(data[2]);
						survey.setYear(data[3]);
						survey.setrD_Value(data[4]);
						survey.setStatus(data[5]);
						survey.setFootnotes(data[6]);
						survey.setUnit_for_TSM_and_CSV(data[7]);
						lines.add(survey);
						
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				
			}catch(IOException e){
				e.printStackTrace();
			}finally {
				bufferedReader.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return lines;
			
	}
	
	public void variableWrite(List<Survey> list){
		
		String str="List1.txt";
		File file=new File(str);
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter(file);
			try {
				
				Iterator<Survey> itr = list.iterator();
                 while(itr.hasNext()){
                	 survey = itr.next();
                	 fileWriter.write(survey.getVariable()+"\n");
				}
			}finally{
				fileWriter.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public void breakdownWrite(List<Survey> list){
		
		String str="List2.txt";
		File file=new File(str);
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter(file);
			try {
				
				Iterator<Survey> itr = list.iterator();
                 while(itr.hasNext()){
                	 survey = itr.next();
                	 fileWriter.write(survey.getBreakdown()+"\n");
				}
			}finally{
				fileWriter.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public void breakdownCategoryWrite(List<Survey> list){
	
	String str="List3.txt";
	File file=new File(str);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			
			Iterator<Survey> itr = list.iterator();
             while(itr.hasNext()){
            	 survey = itr.next();
            	 fileWriter.write(survey.getBreakdown_category()+"\n");
			}
		}finally{
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void yearWrite(List<Survey> list){
	
	String str="List4.txt";
	File file=new File(str);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			
			Iterator<Survey> itr = list.iterator();
             while(itr.hasNext()){
            	 survey = itr.next();
            	 fileWriter.write(survey.getYear()+"\n");
			}
		}finally{
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void rD_ValueWrite(List<Survey> list){
	
	String str="List5.txt";
	File file=new File(str);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			
			Iterator<Survey> itr = list.iterator();
             while(itr.hasNext()){
            	 survey = itr.next();
            	 fileWriter.write(survey.getrD_Value()+"\n");
			}
		}finally{
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void statusWrite(List<Survey> list){
	
	String str="List6.txt";
	File file=new File(str);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			
			Iterator<Survey> itr = list.iterator();
             while(itr.hasNext()){
            	 survey = itr.next();
            	 fileWriter.write(survey.getStatus()+"\n");
			}
		}finally{
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public void footnotesWrite(List<Survey> list){
	
	String str="List7.txt";
	File file=new File(str);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			
			Iterator<Survey> itr = list.iterator();
             while(itr.hasNext()){
            	 survey = itr.next();
            	 fileWriter.write(survey.getFootnotes()+"\n");
			}
		}finally{
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public void unitWrite(List<Survey> list){
	
	String str="List8.txt";
	File file=new File(str);
	FileWriter fileWriter=null;
	try {
		fileWriter=new FileWriter(file);
		try {
			
			Iterator<Survey> itr = list.iterator();
             while(itr.hasNext()){
            	 survey = itr.next();
            	 fileWriter.write(survey.getUnit_for_TSM_and_CSV()+"\n");
			}
		}finally{
			fileWriter.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	public static void main(String[] args) {
		CsvReadFile csvReadFile = new CsvReadFile();
          String fileName="D:\\Eclipse Program\\FileReadWrite\\survey.csv";
          File file= new File(fileName);
        
          List<Survey> s=csvReadFile.readCsvFile(file);
          System.out.println("All data seprated by column");
          csvReadFile.variableWrite(s);
          csvReadFile.breakdownWrite(s);
          csvReadFile.breakdownCategoryWrite(s);
          csvReadFile.yearWrite(s);
          csvReadFile.rD_ValueWrite(s);
          csvReadFile.footnotesWrite(s);
          csvReadFile.statusWrite(s);
          csvReadFile.unitWrite(s);
	}
}
