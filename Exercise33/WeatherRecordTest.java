package Exercise33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeatherRecordTest {
/**
 * this is testing for constructor of class WeatherRecord
 */
	@Test
	void testConstructor() {
		new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
	}
/**
 * this is testing for method withinRange() of class WeatherRecord
 */
	@Test
	void testWithinRange() {
		new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
		  WeatherRecord w1 = new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		  WeatherRecord w2 = new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		  WeatherRecord w3 = new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
			assertTrue(w1.withinRange());
		 	assertFalse(w2.withinRange());
			assertTrue(w3.withinRange());
	}
/**
 * this is testing for method rainyRange() of class WeatherRecord
 */
	@Test
	void testRainyRange() {
		new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
		  WeatherRecord w1 = new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		  WeatherRecord w2 = new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		  WeatherRecord w3 = new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
			  assertFalse(w1.rainyRange(20.2));
			  assertTrue(w2.rainyRange(20.2));
			  assertTrue(w3.rainyRange(20.2));
	}
/**
 * this is testing for method recordDay() of class WeartherRecord
 */
	@Test
	void testRecordDay() {
		new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
		  WeatherRecord w1 = new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		  WeatherRecord w2 = new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		  WeatherRecord w3 = new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
		  assertFalse(w1.recordDay());
		  assertTrue(w2.recordDay());
		  assertFalse(w3.recordDay());
	}
}
