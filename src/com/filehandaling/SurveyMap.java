package com.filehandaling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SurveyMap {
	Survey survey;
	String[] data;
	Map<String, String> csvMapRecord;
	public Map<String, String> mappingData(List<Survey> s){
		  csvMapRecord = new HashMap<String,String>();
		  String str="MapOne.txt";
			File file=new File(str);
			FileWriter fileWriter=null;
			try {
				fileWriter=new FileWriter(file);
				try {
		      for(Survey suv : s ) {
	    		csvMapRecord.put(suv.getVariable(), suv.getBreakdown());
	    	}
	    	
	    	for(Map.Entry<String, String> mapp :csvMapRecord .entrySet() ) {
	    		fileWriter.write(mapp.getKey()+":"+mapp.getValue()+"\n");
	    	}
				}finally {
					fileWriter.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		  return csvMapRecord ;
	}
	
	
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
						
						String variable = data[0];
						String breakDown = data[1];
						survey = new Survey(variable,breakDown); 
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
	public static void main(String[] args) {
		SurveyMap csvReadFile = new SurveyMap();
        String fileName="D:\\Eclipse Program\\FileReadWrite\\survey.csv";
        File file= new File(fileName);
        List<Survey> s=csvReadFile.readCsvFile(file);
    	csvReadFile.mappingData(s);
	}
}
