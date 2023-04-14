package com.filehandaling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReaderInJava {
	Survey survey;
	String[] data;
	public void readCsvFile(File file){
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferWriter = null;
		List<List<String>> lines = new ArrayList<>();
		try{
			bufferedReader = new BufferedReader(new FileReader(file));
			bufferWriter=new BufferedWriter(new FileWriter("test.txt"));
			String line=null;
			try{
				while ((line = bufferedReader.readLine()) != null) {
					data= line.split(",");
					try {
						List<String> values = Arrays.asList(line);
					   lines.add(values);
					   bufferWriter.write(line+"\n");
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				lines.forEach(l->System.out.println(l+"\n"));
			}catch(IOException e){
				e.printStackTrace();
			}finally {
				bufferedReader.close();
				bufferWriter.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
			
	}
	
	public static void main(String[] args){
		CSVReaderInJava cSVReader = new CSVReaderInJava();
		File file= new File("D:\\Eclipse Program\\FileReadWrite\\survey.csv");
		cSVReader.readCsvFile(file);
	}
}

	

