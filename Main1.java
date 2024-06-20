package inheritance;
abstract class Shape {
	public abstract double calculateArea();
	public void display() {
	    System.out.println("Displaying shape");
	 }
}
class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
	    this.radius = radius;
	}
	@Override
	public double calculateArea() {
	    return Math.PI * radius * radius;
	}
	
	public double getRadius() {
	    return radius;
	}
}
class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
	    this.length = length;
	    this.width = width;
	}
	@Override
	public double calculateArea() {
	    return length * width;
	}
	public double getLength() {
	    return length;
	}
	public double getWidth() {
	    return width;
	}
}

public class Main1 {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		
		Shape shape1 = circle;
		Shape shape2 = rectangle;
		
		shape1.display();
		System.out.println("Area of circle: " + shape1.calculateArea());
		System.out.println("Radius of circle: " + ((Circle) shape1).getRadius()); 
		System.out.println();
		        
		shape2.display();
		System.out.println("Area of rectangle: " + shape2.calculateArea());
		System.out.println("Length of rectangle: " + ((Rectangle) shape2).getLength()); 
		System.out.println("Width of rectangle: " + ((Rectangle) shape2).getWidth());
	}
}
