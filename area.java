package shape.java;

public interface area {
	 double getArea();
	}

	// Rectangle class
	class Rectangle implements area {
	    private double width;
	    private double height;

	    public Rectangle(double w, double h) {
	        this.width = w;
	        this.height = h;
	    }

	    @Override
	    public double getArea() {
	        return width * height;
	    }
	}

	// Circle class
	class Circle implements area {
	    private double radius;

	    public Circle(double r) {
	        this.radius = r;
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Triangle class
	class Triangle implements area {
	    private double base;
	    private double height;

	    public Triangle(double b, double h) {
	        this.base = b;
	        this.height = h;
	    }

	    @Override
	    public double getArea() {
	        return 0.5 * base * height;
	    }
	}

	


