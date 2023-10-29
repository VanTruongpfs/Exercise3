package Exercise33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {
/**
 * this is testing for constructor of class Date
 */ 
	@Test
	void testConstructor() {
		new Date(26,10,2023);
		new Date(27,10,2023);
		new Date(28,10,2023);
	}
	

}
