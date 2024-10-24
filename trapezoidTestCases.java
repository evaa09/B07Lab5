import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class trapezoidTestCases {
    
    @Test
    void testPerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(6, 0);
        Point p3 = new Point(6, 8);
        Point p4 = new Point(0, 8);
        
        Trapezoid t1 = new Trapezoid(p1, p2, p3, p4);
        assertEquals(t1.perimeter(), 28);
    }

    @Test
    void testIsoscelesTrue() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(0, 4);
        
        Trapezoid t1 = new Trapezoid(p1, p2, p3, p4);
        assertTrue(t1.isIsosceles());
    }

    @Test
    void testIsoscelesFalse() {
        Point p1 = new Point(0, -1);
        Point p2 = new Point(6, -4);
        Point p3 = new Point(6, 9);
        Point p4 = new Point(0, 8);
        
        Trapezoid t1 = new Trapezoid(p1, p2, p3, p4);
        assertFalse(t1.isIsosceles());
    }
}
