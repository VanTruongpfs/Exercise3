package Exercise33;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemperatureRange {
	private int low;
	private int high;
/**
 * 
 * this is a TemperatureRange constructuor
 * 
 * @param low
 * @param high
 * 
 * example:
 *  new TemperatureRange(25,30);
 *  new TemperatureRange(23,32);
 *  new TemperatureRange(24,30);
 */
	public TemperatureRange(int low, int high) {
		this.low = low;
		this.high = high;
	}
/**
* 
* @param that
* @return
* example:
* 	new TemperatureRange(25,30);
*	new TemperatureRange(23,32);
*	new TemperatureRange(24,30);
*	  TemperatureRange t1 = new TemperatureRange(25,30);
*	  TemperatureRange t2 = new TemperatureRange(23,32);
*	  TemperatureRange t3 = new TemperatureRange(24,30);
*		 assertTrue(t1.withinRange(t3));
*		 assertFalse(t2.withinRange(t1));
*		 assertTrue(t3.withinRange(t2));
* input: Temperature that
* output: boolean
*/
// determines whether today's high and low were within the normal range;
	public boolean withinRange(TemperatureRange that) {
	 return (this.low >= that.low)&&
			 (this.high <= that.high);
 }
/**
 * 
 * @param min
 * @param max
 * @return
* example:
* 	new TemperatureRange(25,30);
*	new TemperatureRange(23,32);
*	new TemperatureRange(24,30);
*	  TemperatureRange t1 = new TemperatureRange(25,30);
*	  TemperatureRange t2 = new TemperatureRange(23,32);
*	  TemperatureRange t3 = new TemperatureRange(24,30);
*		 assertFalse(t1.recordDay(19,31));
*		 assertTrue(t2.recordDay(19,31));
*		 assertFalse(t3.recordDay(19,31));
*input: double min, double max
*output: boolean
 */
//determines whether the temperature today broke either the high or the low record.
	public boolean recordDay(double min, double max) {
		return (this.low) < min || (this.high > max);
	}
}
