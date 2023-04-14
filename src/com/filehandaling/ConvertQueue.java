package com.filehandaling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ConvertQueue {

	Queue<String> myQue;
	List<String> list;
	
	public Queue<String> setVriableQueue(){
		BufferedReader bufferedReader = null;
		BufferedWriter bufferWriter = null;
		try {
			 bufferWriter = new BufferedWriter(new FileWriter("SetQueue.txt"));
			 bufferedReader = new BufferedReader(new FileReader("SetOne.txt"));
			 String line=null;
			 list=new ArrayList<String>();
			 try {
				 while((line=bufferedReader.readLine())!=null) {
					 list.add(line); 
				 }
				 myQue = new PriorityQueue<String>(list);
				 for(String s: myQue){
					 bufferWriter.write(s+"\n");
				 }
			}finally{
				bufferWriter.close();
			}
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return myQue;
	}
	
	public static void main(String[] args) {
		ConvertQueue convertQueue =new ConvertQueue();
		convertQueue.setVriableQueue();

	}

}
