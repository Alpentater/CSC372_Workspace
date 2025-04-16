package main;

//This is the required class 'Sphere' that extends from the abstract class of 'Shape'.
public class Sphere extends Shape {
	
	//The radius component and constructor for the sphere shape.
	private double radius;
	
	public Sphere(double radiusToBe) {
		this.radius = radiusToBe;
	}
	
	//Required method to calculate the surface area of the sphere based on it's radius.
	public double surfaceArea() {
		double result = 4*Math.PI * Math.pow(radius, 2);
		return result;
	}
	
	//Required method to calculate the volume of the sphere.
	public double volume() {
		double result = (4.0/3)*Math.PI*Math.pow(radius, 3);
		return result;
	}
	
	//Method that prints all the data of the sphere to a string.
	public String toString() {
		String result = "Sphere Surface Area: "+ surfaceArea() + '\n' + "Sphere Volume: " + volume();
		return result;
	}
}
