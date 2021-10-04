package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordsInFile {
	public static void totalWord(String str) throws IOException 
	{
		
		int wordCount=0;
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!=null) 
		{	
			String [] arr = line.split(" ");
			for(String Array : arr) 
			{
				 wordCount++;
			}
			line = br.readLine();
		}
		   br.close();
           System.out.println("Total Number Of Word Present In Given File is:"+wordCount);
	}

	public static void main(String[] args) throws IOException 
	{
	
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the path Of File");
		String str = sc.nextLine();
		totalWord(str) ;
		
		
	}

}
