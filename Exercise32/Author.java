package Exercise32;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Author {
	private String name;
	private Date birthDay;
/**
 * this is a constructor Author of class Author
 * @param name
 * @param birthDay
 * example:
 * new Author("Matthias Felleisen", new Date(19,5,1960));
 * new Author("Daniel P. Friedman", new Date(03,12,1939));
 * new Author("Pat Conroy", new Date(26,10,1945));
 */
	public Author(String name, Date birthDay) {
		this.name = name;
		this.birthDay = birthDay;
}
/**
* @param yearMark
* @return
* example: this is example of method currentAuthor() of class Author
*   new Author("Matthias Felleisen", new Date(19,5,1960));
*	new Author("Daniel P. Friedman", new Date(03,12,1939));
*	new Author("Pat Conroy", new Date(26,10,1945));
*	  Author a1 = new Author("Matthias Felleisen", new Date(19,5,1960));
*	  Author a2 = new Author("Daniel P. Friedman", new Date(03,12,1939));
*	  Author a3 = new Author("Pat Conroy", new Date(26,10,1945));
*		  	assertTrue(a1.currentAuthor(1940));
*		  	assertFalse(a2.currentAuthor(1940));
*		  	assertTrue(a3.currentAuthor(1940));
* input: int yearMark
* output: boolean
*/
//  determines whether a book was written by a current author (born after 1940);
	public boolean currentAuthor(int yearMark) {
		return this.birthDay.currentAuthor(yearMark);
	}
/**
 * 
 * @param that
 * @return
 * example:
 *  new Author("Matthias Felleisen", new Date(19,5,1960));
 *  new Author("Daniel P. Friedman", new Date(03,12,1939));
 *  new Author("Pat Conroy", new Date(26,10,1945));
 *   Author a1 = new Author("Matthias Felleisen", new Date(19,5,1960));
 *   Author a2 = new Author("Daniel P. Friedman", new Date(03,12,1939));
 *   Author a3 = new Author("Pat Conroy", new Date(26,10,1945));
 *   	assertTrue(a1.thisAuthor(a1);
 *   	assertFalse(a2.thisAuthor(a3);
 *   	assertFalse(a3.thisAuthor(a1);
 *  input: Author that
 *  output: boolean
 *
 */
// 	determines whether a book was written by the specified author;
	public boolean thisAuthor(Author that) {
		return (this.name.equals(that.name)) && 
				(this.birthDay ==(that.birthDay));
	}
/**
 * 
 * @param other
 * @return
 * example:
 *  new Author("Matthias Felleisen", new Date(19,5,1960));
 *  new Author("Daniel P. Friedman", new Date(03,12,1939));
 *  new Author("Pat Conroy", new Date(26,10,1945));
 *   Author a1 = new Author("Matthias Felleisen", new Date(19,5,1960));
 *   Author a2 = new Author("Daniel P. Friedman", new Date(03,12,1939));
 *   Author a3 = new Author("Pat Conroy", new Date(26,10,1945));
 *   	assertTrue(a1.sameAuthor(a1));
 *   	assertFalse(a2.sameAuthor(a3));
 *   	assertFalse(a3.sameAuthor(a1));
 *  input: Athor other
 *  output: boolean
 */
// 	determines whether one book was written by the same author as some other book;
	public boolean sameAuthor(Author other) {
 		return this.name.equals(other.name);
}
/**
 * 
 * @param that
 * @return
 * example:
 * 	new Author("Matthias Felleisen", new Date(19,5,1960));
 *  new Author("Daniel P. Friedman", new Date(03,12,1939));
 *  new Author("Pat Conroy", new Date(26,10,1945));
 *   Author a1 = new Author("Matthias Felleisen", new Date(19,5,1960));
 *   Author a2 = new Author("Daniel P. Friedman", new Date(03,12,1939));
 *   Author a3 = new Author("Pat Conroy", new Date(26,10,1945));
 *   	assertTrue(a1.sameGeneration(a1));
 *   	assertFalse(a2.sameGeneration(a3));
 *   	assertFalse(a3.sameGeneration(a1));
 *  input: Author that
 *  output: boolean
 */
// determines whether two books were written by two authors born less than 10 year apart.
	public boolean sameGeneration(Author that) {
		return this.birthDay.sameGeneration(that.birthDay,10);
}
}