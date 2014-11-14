package java8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rygn.FormulaImpl;

public class TestFormulaImpl {

	private final static double DELTA = 0.000000001;
	
	private FormulaImpl formula;
	
	@Before
	public void init() {
		
		this.formula = new FormulaImpl();
	}
	
	@Test
	public void testCalculate() {
		
		assertEquals(1100.0, this.formula.calculate(100), DELTA);
	}

	@Test
	public void testSqrt() {
		
		assertEquals(1010.0, this.formula.sqrt(100), DELTA);		
	}

}
