package Exercise34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrainTest {
/**
 * this is testing for constructor of class Train
 */

	@Test
	void testConstructor() {
		new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
	}
/**
 * this is testing for method destinations() of class Train
 */
	@Test
	void testDestinations() {
		new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
	    new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
	    new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
		  Train t1 = new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		  Train t2 = new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		  Train t3 = new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
			assertTrue(t1.destinations("Nha Trang City"));
		 	assertTrue(t2.destinations("Nha Trang City"));
		   	assertTrue(t3.destinations("Quy Nhon City"));
	}
/**
 * this is testing for method timeStart() of class Train
 */
	@Test
	void testTimeStart() {
		new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
		  Train t1 = new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		  Train t2 = new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		  Train t3 = new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
		  	assertEquals(t1.timeStart(),"7h25");
		  	assertEquals(t2.timeStart(),"9h30");
		  	assertEquals(t3.timeStart(),"11h30");
	}
/**
 * this is testing for method timeTrip() of class Train
 */
	@Test
	void testTimeTrip() {
		new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
		  Train t1 = new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		  Train t2 = new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		  Train t3 = new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
			assertEquals(t1.timeTrip(),115);
			assertEquals(t2.timeTrip(),120);
			assertEquals(t3.timeTrip(),1205);
		
	}
}
