package Exercise31;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class House {
	private static final String House = null;
	private String kind;
	private int numberOfRooms;
	private double askingPrice;
	private Address address;
	/**
	 * this is a house constructor
	 * 
	 * @param kind: kind
	 * @param numberOfRooms: number of rooms
	 * @param askingPrice: asking price
	 * @param address: address
	 * 
	 * example: this is example of constructor 
	 * new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
	 * new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
	 * new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
	 */
	public House(String kind, int numberOfRooms, double askingPrice, Address address) {
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.askingPrice = askingPrice;
		this.address = address;
	}
/**
 * this are method of class House
 * @param that
 * @return
 * example: this are example of method compare hasMoreRooms()
 * 	new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
 * 	new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
 * 	new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
 * 	 House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
 * 	 House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
 * 	 House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
 * 		assertTrue(h1.hasMoreRooms(h3)); 
 * 		assertTrue(h2.hasMoreRooms(h1));
 * 		assertFalse(h3.hasMoreRooms(h1));
 *  input: that House
 *  output: boolean
 */
//	determines whether one house has more rooms than some other house
	public boolean hasMoreRooms(House that) {
		return this.numberOfRooms > that.numberOfRooms;
	}
/**
 * @param City
 * @return
 * example: this are example of method inThisCity() of class House
 * 	new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
 * 	new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
 * 	new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
 * 	 House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
 * 	 House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
 * 	 House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
 * 		assertTrue(h1.hasMoreRooms(h3)); 
 * 		assertTrue(h2.hasMoreRooms(h1));
 * 		assertFalse(h3.hasMoreRooms(h1));
 *  input: City
 *  output: boolean
 */
//checks whether the advertised house is in some given city (assume we give the method a city name)
	public boolean inThisCity(String City)	{
		return this.address.inThisCity(City);
	}
/**
 * @param other
 * @return
 * example: this are example of method inThisCity() of class House
 * 	new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
* 	new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
* 	new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
*   House h1 = new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
* 	 House h2 = new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton")); 
* 	 House h3 = new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
* 		assertTrue(h1.sameCity(h3)); 
* 		assertTrue(h2.sameCity(h1));
* 		assertFalse(h3.sameCity(h1));
*  input: House other
*  output: boolean
*/
//	determines whether one house is in the same city as some other house.
	public boolean sameCity(House other) {
		return this.address.sameCity(other.address);
	}
}
