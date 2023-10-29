package Exercise31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddressTest {
/**
 * this is testing for constructor of class Address
 */
	@Test
	void testConstructor() {
		new Address(23 ,"Maple Street", "Brookline");
		new Address(5 ,"Joye Road","Newton");
		new Address(83 ,"Winslow Road", "Waltham");
		 Address a1 = new Address(23 ,"Maple Street", "Brookline");
		 Address a2 = new Address(5 ,"Joye Road","Newton");
		 Address a3 = new Address(83 ,"Winslow Road", "Waltham");
		}
/**
 * this is testing for method inThisCity()
 */
	@Test
	void testInthisCity() {
		new Address(23 ,"Maple Street", "Brookline");
		new Address(5 ,"Joye Road","Newton");
		new Address(83 ,"Winslow Road", "Waltham");
		 Address a1 = new Address(23 ,"Maple Street", "Brookline");
		 Address a2 = new Address(5 ,"Joye Road","Newton");
		 Address a3 = new Address(83 ,"Winslow Road", "Waltham");
		 	assertTrue(a1.inThisCity("Brookline"));
			assertTrue(a2.inThisCity("Newton"));
			assertTrue(a3.inThisCity("Waltham"));
	}
/**
 * this is testing for method sameCity()
 */
	@Test
	void testSameCity() {
		new Address(23 ,"Maple Street", "Brookline");
		new Address(5 ,"Joye Road","Newton");
		new Address(83 ,"Winslow Road", "Waltham");
		 Address a1 = new Address(23 ,"Maple Street", "Brookline");
		 Address a2 = new Address(5 ,"Joye Road","Newton");
		 Address a3 = new Address(83 ,"Winslow Road", "Waltham");
		 	assertTrue(a1.sameCity(a1));
			assertFalse(a2.sameCity(a3));
			assertFalse(a3.sameCity(a1));
}
}
