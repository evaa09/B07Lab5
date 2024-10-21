package lab5;

public class Circle extends Point {
	// Fields
	double radius;
	
	public Circle(double r, int x, int y) {
		super(x,y);
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return Math.PI * getDiameter();
	}
	
	@Override
	public int hashCode() {
		return (int)(3*x + 5*y * radius);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}
	
}
