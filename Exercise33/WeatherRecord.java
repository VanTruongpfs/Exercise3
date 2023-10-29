package Exercise33;

public class WeatherRecord {
	private Date d;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;
/**
 * this is a WeatherRecord constructor
 * @param d
 * @param today
 * @param normal
 * @param record
 * example:
 * 	new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 * 
 */
	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation) {
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
/**
 * 
 * @return
 * example:this is example of method withinRange()
 *  new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 *   WeatherRecord w1 = new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	 WeatherRecord w2 = new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	 WeatherRecord w3 = new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 * 		assertTrue(w1.withinRange());
 * 		assertFalse(w2.withinRange());
 * 		assertFalse(w3.withinRange());
 * input:
 * output: boolean
 */
// determines whether today's high and low were within the normal range;
	public boolean withinRange() {
		return this.today.withinRange(this.normal);
	}
/**
 * 
 * @param mark
 * @return
 * example:this is example of method rainyRange()
 *  new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 *   WeatherRecord w1 = new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	 WeatherRecord w2 = new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	 WeatherRecord w3 = new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 * 		assertFalse(w1.rainyRange(20.2));
 * 		assertTrue(w2.rainyRange(20.2));
 * 		assertTrue(w3.rainyRange(20.2));
 * input: double mark
 * output: boolean
 */
// determines whether the precipitation is higher than some given value;
	public boolean rainyRange(double mark) {
		return this.precipitation > mark;
	}
/**
 * 
 * @return
 * example:this is example of method recordDay()
 *  new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 *   WeatherRecord w1 = new WeatherRecord(new Date(26,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	 WeatherRecord w2 = new WeatherRecord(new Date(27,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	 WeatherRecord w3 = new WeatherRecord(new Date(28,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 * 		assertFalse(w1.recordDay());
 * 		assertTrue(w2.recordDay());
 * 		assertFalse(w3.recordDay());
 * input:
 * output: boolean
 * 
 */
//determines whether the temperature today broke either the high or the low record.
	public boolean recordDay() {
		return this.today.recordDay(19,31);
		
	}


}
