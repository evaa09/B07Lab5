package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecangleTests {

	@Test
	void PerimeterTest() {
		Rectangle r = new Rectangle(new Point(0,0), new Point(0,1), new Point(1,1), new Point(1,0));
		assertEquals(4.0, r.perimeter());
	}
	
	@Test
	void SquareIsSquare() {
		Rectangle r = new Rectangle(new Point(0,0), new Point(0,1), new Point(1,1), new Point(1,0));
		assertTrue (r.isSquare());
	}
	
	@Test
	void NotSquareIsSquare() {
		Rectangle r = new Rectangle(new Point(0,0), new Point(0,2), new Point(1,2), new Point(1,0));
		assertFalse (r.isSquare());
	}

}
