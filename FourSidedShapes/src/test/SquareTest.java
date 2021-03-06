package test;

import static org.junit.Assert.*;

import org.junit.Test;
import point.Point;
import shapes.Square;


public class SquareTest {

	@Test
	public void testSquare() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 0);
		Point p3 = new Point(5, 5);
		Point p4 = new Point(0, 5);
		Square para1 = new Square(p1, p2, p3, p4);
		assertNotNull("Not created", para1);
	}
	
	@Test
	public void testIsSquare(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 0);
		Point p3 = new Point(5, 5);
		Point p4 = new Point(0, 5);
		boolean b = Square.isSquare(p1, p2, p3, p4);
		assertTrue("Points don't make a square", b);
	}
	
	@Test
	public void testIsNotSquare(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(10, 7);
		Point p4 = new Point(5, 0);
		boolean b = Square.isSquare(p1, p2, p3, p4);
		assertFalse("Points do make a square", b);
	}
	
	@Test
	public void testSquareArea(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 0);
		Point p3 = new Point(5, 5);
		Point p4 = new Point(0, 5);
		Square para1 = new Square(p1, p2, p3, p4);
		assertTrue("", para1.getArea()==25);
	}
	@Test
	public void testParallelogramPerimeter(){
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 0);
		Point p3 = new Point(5, 5);
		Point p4 = new Point(0, 5);
		Square para1 = new Square(p1, p2, p3, p4);
		assertTrue("", para1.getPerimeter()==20);
	}

}
