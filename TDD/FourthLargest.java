package TDD;

public class FourthLargest 
{

	public int ForthLargest(int[] array)
	{
		int temp = 0;
		if(array.length < 5)
		{
			throw new RuntimeException();
		}
			
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		
		return array[3];
		
	}
}