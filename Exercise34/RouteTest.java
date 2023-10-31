package Exercise34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RouteTest {
/**
 * this is testing for constructor of class Route
 */
	@Test
	void testConstructor() {
		new Route("Ho Chi Minh City","Nha Trang City");
		new Route("Quy Nhon City","Nha Trang City");
		new Route("Ho Chi Minh City","Quy Nhon City");
	}
/**
 * this is testing for method destinations() of class Route
 */
	@Test
	void testDestinations() {
		new Route("Ho Chi Minh City","Nha Trang City");
		new Route("Quy Nhon City","Nha Trang City");
		new Route("Ho Chi Minh City","Quy Nhon City");
		 Route r1 = new Route("Ho Chi Minh City","Nha Trang City");
		 Route r2 = new Route("Quy Nhon City","Nha Trang City");
		 Route r3 = new Route("Ho Chi Minh City","Quy Nhon City");
		 	assertTrue(r1.destinations("Nha Trang City"));
		 	assertTrue(r2.destinations("Nha Trang City"));
		 	assertTrue(r3.destinations("Quy Nhon City"));
	}

}
