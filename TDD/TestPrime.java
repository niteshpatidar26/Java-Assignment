package TDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrime {

	@Test
	public void test()
	{
		PrimeNumber test = new PrimeNumber();
		
		int [] arr = {2,3,4,5,6,7,9,10,11};
		int expected = 5;
		
		int actual = test.findCountOfPrime(arr);
		assertEquals(expected,actual);
		
	}

}