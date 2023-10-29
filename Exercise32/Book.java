package Exercise32;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Book {
	private String title;
	private double price;
	private int yearOfPublication;
	private Author author;
/**
 * this is a book constructor;
 * 
 * @param authorsName: author's name
 * @param title: title
 * @param price: price
 * @param yearOfPublication: year of publication
 * example:
 * 	new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
 * 	new Book("Heart of Darkness", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
 * 	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
 */
 public Book(String title, double price, int yearOfPublication, Author author) {
	 this.title = title;
	 this.price = price;
	 this.yearOfPublication = yearOfPublication;
	 this.author = author;
 }
/**
* this are method of class Book
* @param year1
* @param year2
* @return
* example: this is method currentBook()
*	new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 	assertTrue(b1.currentBook(2003,2004));
*	 	assertFalse(b2.currentBook(2003,2004));
*	 	assertFalse(b3.currentBook(2003,2004));
*input: year1, year2
*output: boolean
 */
// checks whether the book was published in 2004 or 2003;
 	public boolean currentBook(int year1, int year2) {
 		return this.yearOfPublication == year1 || this.yearOfPublication == year2;
 	}
/**
* 
* @param yearMark
* @return
* example: this is example of method currentAthor()
*   new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*    Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 	assertTrue(b1.currentAuthor(1940));
*	 	assertFalse(b2.currentAuthor(1940));
*	 	assertTrue(b3.currentAuthor(1940));
* input: yearMark
* output: boolean
 */
//  determines whether a book was written by a current author (born after 1940);
 	public boolean currentAuthor(int yearMark){
 		return this.author.currentAuthor(yearMark);
 	}
/**
* 
* @param that
* @return
* example: this is example of method thisAthor()
*   new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 	assertTrue(b1.thisAuthor(b1));
*	 	assertFalse(b2.thisAuthor(b3));
*		assertFalse(b3.thisAuthor(b1));
* input: Book that
* output: boolean 
*/
// 	determines whether a book was written by the specified author;
 	public boolean thisAuthor(Book that) {
 		return this.author.thisAuthor(that.author);
 	}
/**
* 
* @param other
* @return
* example: this is example of method sameAuthor()
* 	new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*		assertTrue(b1.sameAuthor(b1));
*		assertFalse(b2.sameAuthor(b3));
*		assertFalse(b3.sameAuthor(b1));
 */
// 	determines whether one book was written by the same author as some other book;
 	public boolean sameAuthor(Book other) {
 		return this.author.equals(other.author);
 	}
/**
* @param that
* @return
* example: this is example of method sameGeneration()
* 	new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*	 Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", new Date(19,5,1960)));
*	 Book b2 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", new Date(03,12,1939)));
*	 Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", new Date(26,10,1945)));
*		assertFalse(b1.sameGeneration(b2));
*		assertTrue(b2.sameGeneration(b3));
*		assertFalse(b3.sameGeneration(b1));
 */
 // determines whether two books were written by two authors born less than 10 year apart.
 	public boolean sameGeneration(Book that) {
 		return this.author.sameGeneration(that.author);
}
}