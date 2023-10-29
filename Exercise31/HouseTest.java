package Exercise31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {
/**
* this is testing for constructor of class House
*/
	@Test
	void testConstructor() {
		new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
		House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
	}
/**
 * this is testing for method hasMoreRooms()
 */
	@Test
	void testHasMoreRooms() {
		new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
		 House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		 House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		 House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
			assertTrue(h1.hasMoreRooms(h3));
			assertTrue(h2.hasMoreRooms(h1));
			assertFalse(h3.hasMoreRooms(h1));
	}
/**
 * this is testing for method inThisCity()
 */
	@Test
	void testInthisCity() {
	 new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
	 new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
	 new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
		House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
			assertTrue(h1.inThisCity("Brookline"));
			assertTrue(h2.inThisCity("Newton"));
			assertTrue(h3.inThisCity("Waltham"));
		
	}
/**
 * this is testing for method sameCity
 */
	@Test
	void testSameCity() {
		new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
		 House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
		 House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
		 House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
			assertTrue(h1.sameCity(h1));
			assertFalse(h2.sameCity(h3));
			assertFalse(h3.sameCity(h1));
}
}
