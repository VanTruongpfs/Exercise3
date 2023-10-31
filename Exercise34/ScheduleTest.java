package Exercise34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScheduleTest {
/**
 * this is testing of constructor of class Schedule
 */

	@Test
	void testConstructor() {
		new Schedule(new ClockTime(7,25),new ClockTime(9,30));
		new Schedule(new ClockTime(9,30),new ClockTime(11,30));
		new Schedule(new ClockTime(7,25),new ClockTime(11,30));
	}
/**
 * this is testing for method timeStart() of class schedule
 */
	@Test
	void testTimeStart() {
		new Schedule(new ClockTime(7,25),new ClockTime(9,30));
		new Schedule(new ClockTime(9,30),new ClockTime(11,30));
		new Schedule(new ClockTime(7,25),new ClockTime(11,30));
		  Schedule s1 = new Schedule(new ClockTime(7,25),new ClockTime(9,30));
		  Schedule s2 = new Schedule(new ClockTime(9,30),new ClockTime(11,30));
		  Schedule s3 = new Schedule(new ClockTime(7,25),new ClockTime(11,30));
		  assertEquals(s1.timeStart(),"7h25");
		   assertEquals(s2.timeStart(),"9h30");
		   assertEquals(s3.timeStart(),"7h25");
	}
/**
 * this is testing for method timeTrip() of class Schedule
 */
	@Test
	void testTimeTrip() {
		new Schedule(new ClockTime(7,25),new ClockTime(9,30));
		new Schedule(new ClockTime(9,30),new ClockTime(11,30));
		new Schedule(new ClockTime(11,30),new ClockTime(7,25));
		  Schedule s1 = new Schedule(new ClockTime(7,25),new ClockTime(9,30));
		  Schedule s2 = new Schedule(new ClockTime(9,30),new ClockTime(11,30));
		  Schedule s3 = new Schedule(new ClockTime(11,30),new ClockTime(7,25));
			assertEquals(s1.timeTrip(),115);
		 	assertEquals(s2.timeTrip(),120);
			assertEquals(s3.timeTrip(),1205);
	}
}
