package main;
//This is the required class 'Cone' that extends from the abstract class of 'Shape'.
public class Cone extends Shape {
	
	//The base radius and height components of the cone.
	private double radius;
	private double height;
	
	//The cone constructor.
	public Cone (double radiusToBe, double heightToBe) {
		this.radius = radiusToBe;
		this.height = heightToBe;
	}
	
	//REquired method that returns the surface area of the cone.
	public double surfaceArea() {
		double slant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
		double result = Math.PI * radius * (radius + slant);
		return result;
	}
	
	//Method that returns the volume of the cone.
	public double volume() {
		double result = 0.33333 * Math.PI * Math.pow(radius, 2) * height;
		return result;
	}
	
	///Method that returns the volume and surface area of the cone.
	public String toString() {
		String result = "Cone Surface Area: " + surfaceArea() + '\n' + "Cone Volume: " + volume();
		return result;
	}
}
