package com.demo.Vehicle.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class calcTester {
	@Autowired
	private Calculator calc;

	@BeforeEach
	void beforeEach() {

		calc = new Calculator();

	}

	@RepeatedTest(2)
	@DisplayName("Addition")
	public void addNum() {

		assertAll(() -> assertEquals(2, calc.addNum(1, 1)), 
				() -> assertNotEquals(300, calc.addNum(10, 20)),
				() -> assertEquals("numbers added", 300, calc.addNum(100, 200)));
	}

	@Test
	@DisplayName("Subtraction")
	public void subNum() {
		assertSame(60, calc.subNum(50, -10));
		assertNotSame(50, calc.subNum(50, 30));
	}

	@Test
	@DisplayName("multiplication")
	public void mulNum() {
		assertEquals("multipilication of no", 10, calc.mulNum(5, 2));
		assertNotNull(calc.mulNum(0, 2), "multipilication");
	}

	@Test
	@DisplayName("Division")
	public void divNum() {
		assertNotEquals(1, calc.divNum(5, 7));
		assertEquals(1, calc.divNum(5, 5));
		assertEquals("divide", 1, calc.divNum(5, 5));
		assertThrows(ArithmeticException.class, () -> calc.divNum(5, 0), "cannot divide by zero");
	}

	@Test
	@DisplayName("nullValue")
	public void nullValue() {
		String str = null;
		assertNull(str, "test assertnull method");
	}

	@Test
	@DisplayName("Greater no")
	public void greaterNo() {
		assertTrue(()-> 6 > 3, "a>b");
		assertFalse(() -> 5 > 6, "b<a");
	}

	@Test
	@DisplayName("justToTryCountWords")
	public void countWord() {
		assertEquals(2, calc.countString("it's pratice"));
		assertEquals(3, calc.countString("i am  learner"));
	}

}
