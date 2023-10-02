package shape.java;

public class Main {
	    public static void main(String[] args) {
	        // Create instances of different shapes and calculate their areas
	        Rectangle rectangle = new Rectangle(5.0, 4.0);
	        Circle circle = new Circle(3.0);
	        Triangle triangle = new Triangle(6.0, 8.0);

	        // Calculate and print the areas
	        System.out.println("Area of Rectangle: " + rectangle.getArea());
	        System.out.println("Area of Circle: " + circle.getArea());
	        System.out.println("Area of Triangle: " + triangle.getArea());
	    }
	}
