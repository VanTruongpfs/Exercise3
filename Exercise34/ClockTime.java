package Exercise34;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTime {
	private int hour;
	private int minute;
/**
 * this is a constructor of ClockTime
 * 
 * @param hour
 * @param minute
 * example:
 *  new ClockTime(7,25);
 *  new ClockTime(9,30);
 *  new ClockTime(11,30);
 *  
 */
	public ClockTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
/**
 * 
 * @return
 * example: this is example of method timeStart() of class ClockTime
 *  new ClockTime(7,25);
 *  new ClockTime(9,30);
 *  new ClockTime(11,30);
 *   ClockTime c1 = new ClockTime(7,25);
 *   ClockTime c2 = new ClockTime(9,30);
 *   ClockTime c3 = new ClockTime(11,30);
 *   	  assertEquals(c1.timeStart(),"7h25");
*	      assertEquals(c2.timeStart(),"9h30");
*	      assertEquals(c3.timeStart(),"11h30");
* input:
* output: String
 */
	public String timeStart() {
		return this.hour +"h"+ this.minute ;
	}
/**
 * 
 * @param that
 * @return
 * example: this is example of method timeTrip() of class ClockTime
 *  new ClockTime(7,25);
 *  new ClockTime(9,30);
 *  new ClockTime(11,30);
 *   ClockTime c1 = new ClockTime(7,25);
 *   ClockTime c2 = new ClockTime(9,30);
 *   ClockTime c3 = new ClockTime(11,30);
 *   	assertEquals(c1.timeStart(c2));
 *   	assertEquals(c2.timeStart(c3));
 *   	assertEquals(c3.timeStart(c1));
 *  input: ClockTime that
 *  output: int
 */
	public int timeTrip(ClockTime that) {
		
		if(this.hour > that.hour && this.minute > that.minute){
			return (24-(this.hour-that.hour))*60 + (this.minute - that.minute) ;
		}
		else if(this.hour > that.hour && this.minute <= that.minute) {
			return (24-(this.hour -that.hour))*60 - Math.abs(this.minute - that.minute) ;
		}
		else if(this.hour < that.hour && this.minute < that.minute) {
			return Math.abs(this.hour - that.hour)*60 -  Math.abs(this.minute - that.minute);
		}
		else {
			return Math.abs(this.hour - that.hour)*60 +  Math.abs(this.minute - that.minute);
		}
	}
}
