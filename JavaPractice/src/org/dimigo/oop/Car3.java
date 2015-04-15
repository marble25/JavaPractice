/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author		: user
 * @version		: 1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	/**
	 * @return the company
	 */
	public Car3(){}
	public Car3(String company, String model, String color, int maxSpeed, int price)
	{
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.price=price;
	}
	public Car3(String company, String model, String color, int maxSpeed)
	{
		this(company, model, color, maxSpeed, 0);
	}
	public Car3(String company, String model, String color)
	{
		this(company, model, color, 0);
	}
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String ncompany) {
		company = ncompany;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String nmodel) {
		model = nmodel;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String ncolor) {
		color = ncolor;
	}
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int nmaxSpeed) {
		maxSpeed = nmaxSpeed;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int nprice) {
		price = nprice;
	}
	
	
}
