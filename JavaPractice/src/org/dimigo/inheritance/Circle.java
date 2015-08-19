/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Circle
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class Circle extends Figure{
	private int radius;
	
	public Circle(int radius)
	{
		this(0,0, radius);
	}
	protected void printCenter()
	{
		System.out.print("원 ");
		super.printCenter();
	}
	public Circle(int centerX, int centerY, int radius)
	{
		super(centerX, centerY);
		this.radius=radius;
	}
	
	protected double calcArea()
	{
		return radius*radius*Math.PI;
	}
}
