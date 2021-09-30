package TDD;
import java.util.Set;
import java.util.TreeSet;

public class TDDFindDuplicateString 
{
	public int findDuplicateInString(String str)
	{
		int count =0;
		if(str.equals(null))
		{
			throw new NullPointerException();
		}
		
		
		String [] arr = str.split(" ");
		
		Set s = new TreeSet();
		
		for(int i=0;i<arr.length;i++)
		{
			 if(s.add(arr[i])==false)
			 {
				 count = count+1;
			 }
		}
		
           return count;
	}
}