package Exercise34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockTimeTest {
/**
 * this is testing for constructor of class ClockTime
 */
	@Test
	void testConstructor() {
		 new ClockTime(7,25);
		 new ClockTime(9,30);
		 new ClockTime(11,30);
	}
/**
 * this is testing for method timeStart() of class ClockTime
 */
	@Test
	void testTimeStart() {
		 new ClockTime(7,25);
		 new ClockTime(9,30);
		 new ClockTime(11,30);
		  ClockTime c1 = new ClockTime(7,25);
		  ClockTime c2 = new ClockTime(9,30);
		  ClockTime c3 = new ClockTime(11,30);
		   assertEquals(c1.timeStart(),"7h25");
		   assertEquals(c2.timeStart(),"9h30");
		   assertEquals(c3.timeStart(),"11h30");
	}
/**
 * this is testing for method timeTrip() of class ClockTime
 */
	@Test
	void testTimeTrip() {
		new ClockTime(7,25);
		new ClockTime(9,30);
		new ClockTime(11,30);
		 ClockTime c1 = new ClockTime(7,25);
		 ClockTime c2 = new ClockTime(9,30);
		 ClockTime c3 = new ClockTime(11,30);
		   	assertEquals(c1.timeTrip(c2),115);
		   	assertEquals(c2.timeTrip(c3),120);
		   	assertEquals(c3.timeTrip(c1),1205);
	}

}
