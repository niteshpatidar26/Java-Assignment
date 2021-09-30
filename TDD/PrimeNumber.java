package TDD;
public class PrimeNumber 
{
  public int findCountOfPrime(int [] arr)
  {
	  int temp =0;
	  int count =0;
  
	  if(arr.length < 5)
	  {
		  throw new RuntimeException();
	  }
	  for(int i=0;i<arr.length;i++) 
	  {
		  for(int j=2;j<arr[i];j++) 
		  {
			  if(arr[i]%j ==0) 
			  {
				  temp = temp+1;
			  }
		  }
		  if(temp==0) 
		  {
			 count = count+1; 
		  }
		  
		  temp =0;
	  }
	  return count;
  }
}