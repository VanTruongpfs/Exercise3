package Exercise32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuthorTest {
/**
 * this is testing for constructor of class Author
 */
	@Test
	void testConstructor() {
		new Author("Matthias Felleisen", new Date(19,5,1960));
		new Author("Daniel P. Friedman", new Date(03,12,1939));
		new Author("Pat Conroy", new Date(26,10,1945));
	}
/**
 * this is testing for method thisAuthor() of class Author
 */
	@Test
	void testThisAuthor() {
		new Author("Matthias Felleisen", new Date(19,5,1960));
		new Author("Daniel P. Friedman", new Date(03,12,1939));
		new Author("Pat Conroy", new Date(26,10,1945));
		  Author a1 = new Author("Matthias Felleisen", new Date(19,5,1960));
		  Author a2 = new Author("Daniel P. Friedman", new Date(03,12,1939));
		  Author a3 = new Author("Pat Conroy", new Date(26,10,1945));
		  	assertTrue(a1.thisAuthor(a1));
		  	assertFalse(a2.thisAuthor(a3));
		  	assertFalse(a3.thisAuthor(a1));
	}
/**
 * this is testing for method sameAuthor() of class Author
 */
	@Test
	void testSameAuthor() {
		new Author("Matthias Felleisen", new Date(19,5,1960));
		new Author("Daniel P. Friedman", new Date(03,12,1939));
		new Author("Pat Conroy", new Date(26,10,1945));
		 Author a1 = new Author("Matthias Felleisen", new Date(19,5,1960));
		 Author a2 = new Author("Daniel P. Friedman", new Date(03,12,1939));
		 Author a3 = new Author("Pat Conroy", new Date(26,10,1945));
		  	assertTrue(a1.sameAuthor(a1));
		   	assertFalse(a2.sameAuthor(a3));
		  	assertFalse(a3.sameAuthor(a1));
	}

}
