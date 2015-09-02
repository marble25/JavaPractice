/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones = {new IPhone("iPhone 6", "애플", 700000), 
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone phone : phones){
			System.out.println(phone.toString());
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		}
	}
}
