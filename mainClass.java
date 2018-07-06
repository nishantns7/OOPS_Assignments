import java.io.*;
class Shape {
	
	int width, height;
	
	public Shape() {
		width = 3;
		height = 4;
	}
	
	public void getPerimeter(double r) {		//Demonstrates method overloading
		double peri = 2.0 * Math.PI * r;
		System.out.println("Perimeter of circle: " + peri);
	}

	public void getPerimeter() {		//Demonstrates method overloading
		int peri = 4 * width;
		System.out.println("Perimeter of square: " + peri);
	}
	
	public void getArea(double r) {
		double area = Math.PI * r * r;
		System.out.println("Area of circle: " + area);
	}
	
	public void getArea() {
		int area = width * width ;
		System.out.println("Area of square: " + area);
	}
	
}

class Square extends Shape {

	public Square() {
		super();		//Using super keyword to access superclass' constructor
	}
	
	
}

class Circle extends Shape {
	
	double radius;
	
	public Circle(double r) {
		super();
		this.radius = r;		//Using this keyword to refer to the current object
	}
	
	public void getPerimeter() {
		double peri = 2.0 * Math.PI * radius;
		System.out.println("Output from subclass' getPerimeter: " + peri);
	}
	
	public void getArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Output from subclass' getPerimeter: " + area);
	}
}

class mainClass {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of the circle as a decimal.");
		double r = Double.parseDouble(br.readLine());
		Square square = new Square();
		Circle circle = new Circle(r);
		square.getPerimeter();
		square.getArea();
		circle.getPerimeter();		//Demonstrates method overriding
		circle.getArea();		//Demonstrates method overriding
		throw new ShapeNotFoundException("The shape does not exist.");		//Demonstrating custom Exception
	}
}

class ShapeNotFoundException extends Exception {
	public ShapeNotFoundException(String message) {
		super(message);
	}
}
