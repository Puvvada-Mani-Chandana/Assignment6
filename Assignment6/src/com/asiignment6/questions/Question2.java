package com.asiignment6.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Question2 {
public static void main(String args[]) {
	HashMap<String, Integer> wordCount = new HashMap<>();

	File data=new File("word.txt");

		try {
		  FileReader reader = new FileReader(data);
		  BufferedReader br = new BufferedReader(reader);
		  String lines = br.readLine();
		  String[] words = lines.split(" ");
		  int count = 0;
	  for (int i = 0; i < words.length; i++) {
		  if (wordCount.containsKey(words[i])) {         
		      wordCount.put(words[i], count++);
		    }
		    else {
	      wordCount.put(words[i], count++);
		    }
	  }
		}
		catch (FileNotFoundException e) {
	  System.err.println("File not found.");
		}
		catch (Exception e) {
	  e.printStackTrace();
		   }
		System.out.println(wordCount);
	

	}

}
