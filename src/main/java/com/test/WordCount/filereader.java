package com.test.WordCount;

import java.io.BufferedReader;
import java.io.FileReader;
public class filereader { 
	public static final String searchCount = null;
	{
		BufferedReader br;
		try 
		{
	br = new BufferedReader (new FileReader("/home/polmon/Documents/workspace-sts-3.8.2.RELEASE/WordCount/target/classes/com/test/WordCount/1.txt"));
	String line = null;
	int linecount = 0;
	String searchFor = "hyd";
	int searchLength=searchFor.length();
	int searchCount = 0;
	while ((line = br.readLine()) != null) 
	{
		linecount++;
		for(int searchIndex=0;searchIndex<line.length();) 
		{
			int index=line.indexOf(searchFor,searchIndex);
			
			if(index!=-1) 
			{
			System.out.println("Line number " + linecount);
			searchCount++;
			searchIndex+=index+searchLength;
			} 
			else { break; }
		}
		System.out.println("SearchCount = "+searchCount);
	}
	
	} 
	catch(Exception e) 
	{ 
		System.out.println(e); 
	}
}
}
