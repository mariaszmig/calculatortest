package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3, 2));
	}

	@Test
	public void testSubtract() {
		assertEquals(3, calc.subtract(6, 3));
	}

}
