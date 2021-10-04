package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AlternativePostitionToUpperCase {
	public static void replaceAlternate(String str) throws IOException 
	{
		String Temp = " ";
		String[] Array ;
		String Update = " ";
		
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!= null)
		{	
			Temp = Temp + line + System.lineSeparator();
			line = br.readLine();	
		}
		
		Array = Temp.split(" ");
		for(int i=0;i<Array.length;i++) 
		{
			if(i%2!=0) 
			{
				Update = Update+" " + Array[i];
			}
			else 
			{
				Update = Update+ " " + Array[i].toUpperCase();
			}
		}
		
		FileWriter fw = new FileWriter(str);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(Update);
		bw.flush();
		bw.close();
		br.close();

	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		replaceAlternate(str);
	}

}
