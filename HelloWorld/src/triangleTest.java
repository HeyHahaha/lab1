import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {
	
	triangle triangle = new triangle();
	
	
	@Test
	public void testEquilateral() {
		triangle.angle(3, 3, 3);
		assertEquals(1, triangle.getResult());
	}
	
	@Test
	public void testIsosceles() {
		triangle.angle(5, 5, 2);
		assertEquals(2, triangle.getResult());
	}
	
	@Test
	public void testScalene() {
		triangle.angle(3, 4, 5);
		assertEquals(3, triangle.getResult());
	}
	
	@Test
	public void testUntriangle() {
		triangle.angle(5, 8, 20);
		assertEquals(-111, triangle.getResult());
	}
	
	@Test
	public void testMinus() {
		triangle.angle(-1, 10, 8);
		assertEquals(-10000, triangle.getResult());
	}
}
