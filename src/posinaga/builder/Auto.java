package posinaga.builder;

import java.util.LinkedList;
import java.util.List;

public class Auto {
    	
	private final String name; //required
	private double price;
	private int year;
	private String color;
	private double maxSpeed;
	private List<Owner> owners;
	
	// Constructors //
	
	public Auto(String name, double price, int year, String color, double maxSpeed) {
		this.name = name;
		this.price = price;
		this.year = year;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		owners = new LinkedList<Owner>();
	}
	
	public Auto(String name, double price, int year, String color){
		this(name,price,year,color,0.0);
	}
	
	public Auto(String name, double price, int year){
		this(name,price,year,"Red");
	}
	
	public Auto(String name, double price){
		this(name,price,1925);
	}
	
	public Auto(String name){
		this(name,0.0);
	}
	
	// Getters & Setters //

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public List<Owner> getOwners() {
		return owners;
	}

	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}

	public String getName() {
		return name;
	}

	
	// Other Methods //
	
	@Override
	public String toString() {
		return "Auto [name=" + name + ", price=" + price + ", year=" + year + ", color=" + color + ", maxSpeed="
				+ maxSpeed + ", owners=" + owners + "]";
	}
	

}
