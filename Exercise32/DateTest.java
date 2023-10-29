package Exercise32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {
/**
 * this is testing for constructor of class Date
 */
	@Test
	void testConstructor() {
		new Author("Matthias Felleisen", new Date(19,5,1960));
		new Author("Daniel P. Friedman", new Date(03,12,1939));
		new Author("Pat Conroy", new Date(26,10,1945));
	}
/**
 * this is testing for method currentAuthor() of class Date
 */
	@Test
	void testCurrentAuthor() {
		 new Date(19,5,1960);
		 new Date(03,12,1939);
		 new Date(26,10,1945);
		  Date d1 = new Date(19,5,1960);
		  Date d2 = new Date(03,12,1939);
		  Date d3 = new Date(26,10,1945);
		  	assertTrue(d1.currentAuthor(1940));
		  	assertFalse(d2.currentAuthor(1940));
		  	assertTrue(d3.currentAuthor(1940));
	}
/**
 * this is testing for method thisAuthor of class Date
 */
	@Test
	void testThisAuthor() {
		new Date(19,5,1960);
		new Date(03,12,1939);
		new Date(26,10,1945);
		   Date d1 = new Date(19,5,1960);
		   Date d2 = new Date(03,12,1939);
		   Date d3 = new Date(26,10,1945);
		  	assertTrue(d1.thisAuthor(d1));
		 	assertFalse(d2.thisAuthor(d3));
		 	assertFalse(d3.thisAuthor(d1));
	}
/**
 * this is testing for method sameGeneration() of class Date
 */
	@Test
	void testSameGeneration() {
		new Date(19,5,1960);
		new Date(03,12,1939);
		new Date(26,10,1945);
		 Date d1 = new Date(19,5,1960);
		 Date d2 = new Date(03,12,1939);
		 Date d3 = new Date(26,10,1945);
		 	assertFalse(d1.sameGeneration(d2,10));
		 	assertTrue(d2.sameGeneration(d3,10));
		    assertFalse(d3.sameGeneration(d1,10));
	}
}
