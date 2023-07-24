package com.java.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class NoCharWordLine {
	public static void main(String...args)
	{
		FileReader fr=null;
		BufferedReader reader=null;
		
		 int charCount = 0;
         
	        int wordCount = 0;
	         
	        int lineCount = 0;
	         
	        try
	        {
	            //Creating BufferedReader object
	             
	            reader = new BufferedReader(new FileReader("C:\\Users\\kaviy\\Kaviya_Eclipse_2023_03 _Workspace\\OnlineLearning\\src\\com\\java\\io\\Sample.txt"));
	             
	            //Reading the first line into currentLine
	             
	            String currentLine = reader.readLine();
	             
	            while (currentLine != null)
	            {
	                //Updating the lineCount
	                 
	                lineCount++;
	                 
	                //Getting number of words in currentLine
	                 
	                String[] words = currentLine.split(" ");
	                 
	                //Updating the wordCount
	                 
	                wordCount = wordCount + words.length;
	                 
	                //Iterating each word
	                 
	                for (String word : words)
	                {
	                    //Updating the charCount
	                     
	                    charCount = charCount + word.length();
	                }
	                 
	                //Reading next line into currentLine
	                 
	                currentLine = reader.readLine();
	            }
	             
	            //Printing charCount, wordCount and lineCount
	             
	            System.out.println("Number Of Chars In A File : "+charCount);
	             
	            System.out.println("Number Of Words In A File : "+wordCount);
	             
	            System.out.println("Number Of Lines In A File : "+lineCount);
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                reader.close();           //Closing the reader
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
}
}
