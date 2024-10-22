import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {
	
	@Test
	void testCircle() {
		Circle c1 = new Circle(1, 0, 0);
		assertTrue(c1.x == 0 && c1.y == 0 && c1.radius == 1);
	}
	
	@Test
	void testGetRadius() {
		Circle c1 = new Circle(5, 1, 2);
		double r = c1.getRadius();
		assertEquals(r, 5);
	}
	
	@Test
	void testSetRadius() {
		Circle c1 = new Circle(2,2,2);
		c1.setRadius(7);
		assertEquals(c1.radius, 7);
	}
	
	@Test
	void testGetDiameter() {
		Circle c1 = new Circle(3,1,0);
		assertEquals(c1.getDiameter(), 6);
	}
	
	@Test
	void testGetArea() {
		Circle c1 = new Circle(1,0,0);
		assertEquals(c1.getArea(), Math.PI);
	}
	
	@Test
	void testGetPerimeter() {
		Circle c1 = new Circle(1,2,8);
		assertEquals(c1.getPerimeter(), 2*Math.PI);
	}
	
	@Test
	void testHashCode() {
		Circle c1 = new Circle(1,4,4);
		Circle c2 = new Circle(1,4,4);
		assertEquals(c1.hashCode(),c2.hashCode());
	}
	
	@Test
	void testEquals1() {
		Circle c1 = new Circle(2,0,0);
		assertTrue(c1.equals(c1));
	}
	
	@Test
	void testEquals2() {
		Circle c1 = new Circle(2,0,0);
		Circle c2 = null;
		assertTrue(!(c1.equals(c2)));
	}
	
	@Test
	void testEquals3() {
		Circle c1 = new Circle(2,0,0);
		int x = 5;
		assertTrue(!(c1.equals(x)));
	}
	
	@Test
	void testEquals4() {
		Circle c1 = new Circle(2,0,0);
		Circle c2 = new Circle(4,1,0);
		assertTrue(!(c1.equals(c2)));
	}
	
	@Test
	void testEquals5() {
		Circle c1 = new Circle(2,0,0);
		Circle c2 = new Circle(4,0,1);
		assertTrue(!(c1.equals(c2)));
	}
	
	@Test
	void testEquals6() {
		Circle c1 = new Circle(2,0,0);
		Circle c2 = new Circle(4,0,0);
		assertTrue(!(c1.equals(c2)));
	}
	
	@Test
	void testEquals7() {
		Circle c1 = new Circle(2,0,0);
		Circle c2 = new Circle(2,0,0);
		assertTrue(c1.equals(c2));
	}
}
