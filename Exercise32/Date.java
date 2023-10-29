package Exercise32;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Date {
	private int day ;
	private int month;
	private int year;
/**
 * this is a constructor Date of class Date
 * @param day
 * @param month
 * @param year
 * example:
 *  new Date(19,5,1960);
 *  new Date(03,12,1939);
 *  new Date(26,10,1945);
 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
/**
 * @param yearMark
 * @return
 * example:
 *  new Date(19,5,1960);
 *  new Date(03,12,1939);
 *  new Date(26,10,1945);
 *   Date d1 = new Date(19,5,1960);
 *   Date d2 = new Date(03,12,1939);
 *   Date d3 = new Date(26,10,1945);
 *   	assertTrue(d1.currentAuthor(1940));
 *   	assertFalse(d2.currentAuthor(1940));
 *   	assertTrue(d3.currentAuthor(1940));
 * input: yearMark
 * output: boolean
 */
//  determines whether a book was written by a current author (born after 1940);
	public boolean currentAuthor(int yearMark) {
		return this.year > yearMark;
	}
/**
 * 
 * @param that
 * @return
 * example:
 *  new Date(19,5,1960);
 *  new Date(03,12,1939);
 *  new Date(26,10,1945);
 *   Date d1 = new Date(19,5,1960);
 *   Date d2 = new Date(03,12,1939);
 *   Date d3 = new Date(26,10,1945);
 *   	assertTrue(d1.thisAuthor(d1));
 *		assertFalse(d2.thisAuthor(d3));
 * 		assertFalse(d3.thisAuthor(d1));
 * 	
 */
	public boolean thisAuthor(Date that) {
		return (this.year ==  that.year) &&
				(this.month == that.month)&&
				(this.day == that.day);
	}
/**
 * 
 * @param that
 * @param period
 * @return
 * example:
 *  new Date(19,5,1960);
 *  new Date(03,12,1939);
 *  new Date(26,10,1945);
 *   Date d1 = new Date(19,5,1960);
 *   Date d2 = new Date(03,12,1939);
 *   Date d3 = new Date(26,10,1945);
 *   	assertFalse(d1.sameGeneration(d2,10));
 *   	assertTrue(d2.sameGeneration(d3,10));
 *   	assertFalse(d3.sameGeneration(d1,10));
 *  input: Date that
 *  output: boolean
 */
// determines whether two books were written by two authors born less than 10 year apart.
	public boolean sameGeneration(Date that, int period) {
		return Math.abs(this.year-that.year) <= period;
	}
}
