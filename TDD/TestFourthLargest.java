package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFourthLargest {

	@Test
	void test() {
		FourthLargest arrayClass = new FourthLargest();
		   int[] array = {5,4,2,3,1,6};
		   int expected = 4;
		   
		   int actual = arrayClass.ForthLargest(array);
		   assertEquals(expected, actual);
	}

}
