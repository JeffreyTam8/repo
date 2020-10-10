import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Jeffrey Tam
 * 10/10/20
 * CMSC 203 21559
 */

//Task #2
class GradeBookTester {

	GradeBook objectA = new GradeBook(5);
	GradeBook objectB = new GradeBook(5); 
	
	@BeforeEach
	void setUp() throws Exception {
		
		objectA.addScore(60);
		objectA.addScore(70);
		objectA.addScore(80);
		objectA.addScore(90);
		objectA.addScore(100);
		
		objectB.addScore(13.5);
		objectB.addScore(50.1);
		objectB.addScore(34.8);
		objectB.addScore(0);
		objectB.addScore(0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		objectA = null;
		objectB = null; 
		
	}

	@Test
	void testAddScore() {
		
		assertTrue(objectA.toString().equals("60.0 70.0 80.0 90.0 100.0 "));
		assertTrue(objectB.toString().equals("13.5 50.1 34.8 0.0 0.0 "));
		
		assertEquals(5, objectA.getScoreSize());
		assertEquals(5, objectB.getScoreSize());
		
	}

	@Test
	void testSum() {
		
		assertEquals(400.0, objectA.sum());
		assertEquals(98.4, objectB.sum());
		
	}

	@Test
	void testMinimum() {
		
		assertEquals(60.0, objectA.minimum());
		assertEquals(0.0, objectB.minimum());
		
	}

	@Test
	void testFinalScore() {
		
		assertEquals(340.0, objectA.finalScore());
		assertEquals(98.4, objectB.finalScore());
		
	}

	@Test
	void testGetScoreSize() {
		
		assertEquals(5, objectA.getScoreSize());
		assertEquals(5, objectB.getScoreSize());
		
	}

	@Test
	void testToString() {
		
		assertTrue(objectA.toString().equals("60.0 70.0 80.0 90.0 100.0 "));
		assertTrue(objectB.toString().equals("13.5 50.1 34.8 0.0 0.0 "));
		
	}

}
