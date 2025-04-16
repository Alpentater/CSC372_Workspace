package main;
//This is the required class 'Cylinder' that extends from the abstract class of 'Shape'.
public class Cylinder extends Shape {
	
	//The radius and height components of the cylinder
	private double radius;
	private double height;
	
	//The constructor of the cylinder
	public Cylinder(double radiusToBe, double heightToBe) {
		this.radius = radiusToBe;
		this.height = heightToBe;
	}
	
	//The required method that calculates the surface area of a cylinder.
	public double surfaceArea() {
		double result = 2 * Math.PI * radius * (radius+height);
		return result;
	}
	
	//The required method that calculates the volume of a cylinder.
	public double volume() {
		double result = Math.PI * Math.pow(radius,  2)*height;
		return result;
	}
	
	//Method that prints the volume and surface area of the cylinder to a string.
	public String toString() {
		String result = "Cylinder Surface Area: " + surfaceArea() + '\n' + "Cylinder Volume: " + volume();
		return result;
	}
}
