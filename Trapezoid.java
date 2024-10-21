public class Trapezoid{
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Trapezoid(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public boolean isIsosceles() {
		double dAB = A.distance(B);
		double dCD = C.distance(D);
		double dBC = B.distance(C);
		double dDA = D.distance(A);
		if (!(dAB == dCD && dBC == dDA))
			return false;
		return true;
	}
}