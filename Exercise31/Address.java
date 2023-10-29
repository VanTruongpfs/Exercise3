package Exercise31;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Address {
	private int houseNumber;
	private String streetName;
	private String city;
/**
 * this is a Address constructor
 * 
 * @param houseNumber: house number
 * @param streetName: stress name
 * @param city: city
 * 
 * example:
 * 	new Address(23, "Maple Street", "Brookline");
 * 	new Address(5, "Joye Road", "Newton");
 * 	new Áddress(83, "Winslow Road", "Waltham");
 */
	public Address(int houseNumber, String streetName, String city) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
	}
/**
 * this are method of class Address
 * @param City
 * @return
 * example:this is example of method inThisCity()
 * 	new Address(23, "Maple Street", "Brookline");
 * 	new Address(5, "Joye Road", "Newton");
 * 	new Áddress(83, "Winslow Road", "Waltham");
 * 	 Address a1 = new Address(23, "Maple Street", "Brookline");
 * 	 Address a2 = new Address(5, "Joye Road", "Newton");
 * 	 Address a3 = new Áddress(83, "Winslow Road", "Waltham");
 *		assertTrue(a1.inThisCity("Brookline"));
 * 		assertTrue(a2.inThisCity("Newton"));		
 * 		assertTrue(a3.inThisCity("Waltham")); 
 * 
 * input: String City
 * output: boolean
 */
//checks whether the advertised house is in some given city (assume we give the method a city name)
	public boolean inThisCity(String City) {
		return this.city.equals(City);
	}
/**
* example:this is example of method sameCity()
* 	new Address(23, "Maple Street", "Brookline");
* 	new Address(5, "Joye Road", "Newton");
* 	new Áddress(83, "Winslow Road", "Waltham");
* 	 Address a1 = new Address(23, "Maple Street", "Brookline");
* 	 Address a2 = new Address(5, "Joye Road", "Newton");
* 	 Address a3 = new Áddress(83, "Winslow Road", "Waltham");
* 		assertTrue(a1.sameCity(a1));
*		assertFalse(a2.sameCity(a3));
*		assertFalse(a3.sameCity(a1));
* input: Address other
* output: boolean
*/
//	determines whether one house is in the same city as some other house.
	public boolean sameCity(Address other) {
		return this.city.equals(other.city);
	}
	
}
