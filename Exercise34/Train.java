package Exercise34;

public class Train {
	private Schedule schedule;
	private Route route;
	private boolean local;
/**
 * 
 * this is a constructor of Train
 * 
 * @param schedule
 * @param route
 * @param local
 * 
 * example:
 * 	new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 * 	
 */
	public Train(Schedule schedule, Route route, boolean local) {
		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}
/**
 * 
 * @param place
 * @return
 * example: this is example of method destinations() of class Train
 *	new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 *	 Train t1 = new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *   Train t2 = new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *   Train t3 = new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 *   	assertTrue(t1.destinations("Nha Trang City"));
 *   	assertTrue(t2.destinations("Nha Trang City"));
 *   	assertTrue(t3.destinations("Quy Nhon City"));
 *  input: String place
 *  output: boolean
 */
//	determine his destination station match the destination of the train trip?
	public boolean destinations(String place) {
		return this.route.destinations(place);
	}
/**
 * 
 * @return
 * example: this is example of method timeStart() of class Train
 *  new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 *	 Train t1 = new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *   Train t2 = new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *   Train t3 = new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 *   	assertEquals(t1.timeStart(),"7h25");
 *   	assertEquals(t2.timeStart(),"9h30");
 *   	assertEquals(t3.timeStart(),"7h25");
 *  input:
 *  output: String
 */
//	determine What time does the train start ?
	public String timeStart() {
		return this.schedule.timeStart();
	}
/**
 * 
 * @return
 * example: this is example of method timeTrip() of class Train
 *  new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 *	 Train t1 = new Train(new Schedule(new ClockTime(7,25),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *   Train t2 = new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *   Train t3 = new Train(new Schedule(new ClockTime(11,30),new ClockTime(7,25)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 *   	assertEquals(t1.timeTrip(),115);
 *   	assertEquals(t2.timeTrip(),120);
 *   	assertEquals(t3.timeTrip(),1205);
 *  input:
 *  output: int
 */
// compute how long does the train trip take?
	public int timeTrip() {
		return this.schedule.timeTrip();
	}

}
