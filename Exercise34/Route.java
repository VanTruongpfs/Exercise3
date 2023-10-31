package Exercise34;

public class Route {
	private String origin;
	private String destination;
/**
 * 
 * this is a constructor of Route
 * 
 * @param origin
 * @param destination
 * 
 * example:
 * 	new Route("Ho Chi Minh City","Nha Trang City");
 * 	new Route("Quy Nhon City","Nha Trang City");
 * 	new Route("Ho Chi Minh City","Quy Nhon City");
 */
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
/**
 * 
 * @param place
 * @return
 * example:this is example of method destinations() of class Route
 *  new Route("Ho Chi Minh City","Nha Trang City");
 * 	new Route("Quy Nhon City","Nha Trang City");
 * 	new Route("Ho Chi Minh City","Quy Nhon City");
 *   Route r1 = new Route("Ho Chi Minh City","Nha Trang City");
 * 	 Route r2 = new Route("Quy Nhon City","Nha Trang City");
 * 	 Route r3 = new Route("Ho Chi Minh City","Quy Nhon City");
 * 		assertTrue(r1.destination("Nha Trang City"));
 * 		assertTrue(r2.destination("Nha Trang City"));
 * 		assertTrue(r3.destination("Quy Nhon City"));
 * input: String place
 * output: boolean
 *  
 */
	public boolean destinations(String place) {
		return this.destination.equals(place);
	
}
}
