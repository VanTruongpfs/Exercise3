package Exercise34;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Schedule {
	private ClockTime departure;
	private ClockTime arrival;
/**
 * this is a constructor of Schedule
 * 
 * @param departure
 * @param arriaval
 * 
 * example:
 *	new Schedule(new ClockTime(7,25),new ClockTime(9,30));
 *	new Schedule(new ClockTime(9,30),new ClockTime(11,30));
 *	new Schedule(new ClockTime(7,25),new ClockTime(11,30));
 * 
 */
	public Schedule(ClockTime departure, ClockTime arrival) {
		this.departure = departure;
		this.arrival = arrival;
	}
/**
 * 
 * @return
 * example: this is example of method timeStart() of class Schedule
 * 	new Schedule(new ClockTime(7,25),new ClockTime(9,30));
 *	new Schedule(new ClockTime(9,30),new ClockTime(11,30));
 *	new Schedule(new ClockTime(7,25),new ClockTime(11,30));
 * 	 Schedule s1 = new Schedule(new ClockTime(7,25),new ClockTime(9,30));
 *	 Schedule s2 = new Schedule(new ClockTime(9,30),new ClockTime(11,30));
 *	 Schedule s3 = new Schedule(new ClockTime(7,25),new ClockTime(11,30));
 *		  assertEquals(s1.timeStart(),"7h25");
 *		  assertEquals(s2.timeStart(),"9h30");
 *		  assertEquals(s3.timeStart(),"7h30");
 *  input:
 *  output: String
 * 	
 */
	public String timeStart() {
		return this.departure.timeStart();
	}
/**
* 
* @return
* example: this is example of method timeTrip() of class Schedule
* new Schedule(new ClockTime(7,25),new ClockTime(9,30));
*	new Schedule(new ClockTime(9,30),new ClockTime(11,30));
*	new Schedule(new ClockTime(11,30),new ClockTime(7,25));
*	 Schedule s1 = new Schedule(new ClockTime(7,25),new ClockTime(9,30));
*	 Schedule s2 = new Schedule(new ClockTime(9,30),new ClockTime(11,30));
*	 Schedule s3 = new Schedule(new ClockTime(11,30),new ClockTime(7,25));
*		assertEquals(s1.timeTrip(),115);
*		assertEquals(s2.timeTrip(),120);
*		assertEquals(s3.timeTrip(),1205);
* input:
* output:int
*/
	public int timeTrip() {
		return this.departure.timeTrip(this.arrival) ;
	}
}
