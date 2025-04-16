package main;

//Our main Shape Array Class. (Entry point of the program.)
public class ShapeArray {
	public static void main(String[] args) {
		
		//The array of shapes we are going to populate and print data about.
		Shape[] shapeArray = new Shape[3];
		
		//All the components of our 'soon to be shapes'!
		double sphereSize = 4;
		double coneRadius = 3;
		double coneHeight = 12.32;
		double cylinderRadius = 20;
		double cylinderHeight = 50.25;
		
		//Creating our shapes and plopping them into the shapeArray.
		shapeArray[0] = new Sphere(sphereSize);
		shapeArray[1] = new Cone(coneRadius, coneHeight);
		shapeArray[2] = new Cylinder(cylinderRadius, cylinderHeight);
		
		//Going through each shape in the shape array and printing it to the console seperated by a new line/
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString() + '\n');
		}
	}
}
