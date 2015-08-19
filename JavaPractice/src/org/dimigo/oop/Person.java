/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Person
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 23.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class Person {
	private String name;
	private String character;
	
	private final String birthDt;
	private final String bloodType;
	public static final String TYPE = "mammals";
	/**
	 * @param name
	 * @param character
	 * @param birthDt
	 * @param bloodType
	 */
	public Person(String name, String character, String birthDt,
			String bloodType) {
		this.name = name;
		this.character = character;
		this.birthDt = birthDt;
		this.bloodType = bloodType;
	}
	
	public String toString() {
		return "Person [name=" + name + ", character=" + character
				+ ", birthDt=" + birthDt + ", bloodType=" + bloodType
				+ ", type=" + TYPE + "]";
	}
	
	
	
}
