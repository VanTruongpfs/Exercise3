package Exercise33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureRangeTest {
/**
 * this is testing constructor of class TemperatureRange
 */
	@Test
	void testConstructor() {
		new TemperatureRange(25,30);
		new TemperatureRange(23,32);
		new TemperatureRange(24,30);
	}
/**
 * this is testing for method withinRange() of class TemperatureRange
 */
	@Test
	void testWithinRange() {
		new TemperatureRange(25,30);
		new TemperatureRange(23,32);
		new TemperatureRange(24,30);
		 TemperatureRange t1 = new TemperatureRange(25,30);
		 TemperatureRange t2 = new TemperatureRange(23,32);
		 TemperatureRange t3 = new TemperatureRange(24,30);
		 	assertTrue(t1.withinRange(t3));
		 	assertFalse(t2.withinRange(t1));
		 	assertTrue(t3.withinRange(t2));
	}
/**
 * this is testing for method recordDay() of class TemperatureRange
 */
	@Test
	void testRecordDay() {
		new TemperatureRange(25,30);
		new TemperatureRange(23,32);
		new TemperatureRange(24,30);
		 TemperatureRange t1 = new TemperatureRange(25,30);
		 TemperatureRange t2 = new TemperatureRange(23,32);
		 TemperatureRange t3 = new TemperatureRange(24,30);
		 	assertFalse(t1.recordDay(19,31));
		 	assertTrue(t2.recordDay(19,31));
		 	assertFalse(t3.recordDay(19,31));
	}
}
