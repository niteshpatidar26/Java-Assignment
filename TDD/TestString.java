package TDD;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestString {

	@Test
	void test() {

		TDDFindDuplicateString ds = new TDDFindDuplicateString();
		
		String str = "Java is Object Oriented and Java is a good programmig Language Too";
		int expected = 2;
		
		int actual = ds.findDuplicateInString(str);
		assertEquals(expected,actual);
	}

}
