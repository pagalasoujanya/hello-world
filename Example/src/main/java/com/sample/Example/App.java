package com.sample.Example;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
   	public static void main(String args[])
   	{
   			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
   			String dateInString = "03-nov-2016";
   			try {
   				Date date = formatter.parse(dateInString);
   				System.out.println(date);
   				System.out.println(formatter.format(date));
   				}
   			catch (ParseException e) {
   		            e.printStackTrace();
   		        }

   	}
}