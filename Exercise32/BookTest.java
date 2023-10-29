package Exercise32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
/**
 * this is testing constructor of class Book
 */
	@Test
	void testConstructor() {
	 	new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
	 	new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
	 	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
	}
/**
 * this is testing for method currentBook()
 */
	@Test
	void testCurrentBook() {
		new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 	assertTrue(b1.currentBook(2003,2004));
		 	assertFalse(b2.currentBook(2003,2004));
		 	assertFalse(b3.currentBook(2003,2004));
	}
/**
 * this is testing for method currentAuthor()
 */
	@Test
	void testCurrentAuthor() {
		new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 	assertTrue(b1.currentAuthor(1940));
		 	assertFalse(b2.currentAuthor(1940));
		 	assertTrue(b3.currentAuthor(1940));
	}
/**
 * this is testing for method thisAuthor()
 */
	@Test
	void testThisAuthor() {
		new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 	assertTrue(b1.thisAuthor(b1));
		 	assertFalse(b2.thisAuthor(b3));
			assertFalse(b3.thisAuthor(b1));
	}
/**
 * this is testing for method sameAuthor()
 */
	@Test
	void testSameAuthor() {
		new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 	assertTrue(b1.sameAuthor(b1));
		 	assertFalse(b2.sameAuthor(b3));
		 	assertFalse(b3.sameAuthor(b1));
}
/**
 * this is testing for method sameGeneration()
 */
	@Test
	void testSameGeneration() {
		new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
		 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
		 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
		 	assertFalse(b1.sameGeneration(b2));
		 	assertTrue(b2.sameGeneration(b3));
		 	assertFalse(b3.sameGeneration(b1));
}
}