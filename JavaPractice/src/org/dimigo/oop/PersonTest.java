/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PersonTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 23.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("심민규", "못되 처먹음", "19980420", "A형");
		Person p2 = new Person("박민준", "착함", "19980417", "A형");
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		System.out.println(Person.TYPE);
	}
}
