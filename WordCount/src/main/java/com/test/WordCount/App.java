package com.test.WordCount;

import java.io.BufferedReader;
import java.io.FileReader;

public class App 
{
	public static void main(String args[]) throws Exception 
	{
	try 
	{
	@SuppressWarnings("resource")
	BufferedReader br = new BufferedReader (new FileReader ("1.txt"));
	String line = null;
	int linecount = 0;
	String searchFor = "good";
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
	}
	System.out.println("SearchCount = "+searchCount);
	} 
	catch(Exception e) 
	{ System.out.println(e); }
	}
}