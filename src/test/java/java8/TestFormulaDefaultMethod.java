package java8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.rygn.Formula;
import org.rygn.FormulaImpl;

public class TestFormulaDefaultMethod {

	private final static double DELTA = 0.000000001;
	
	private Formula formula;
	
	@Before
	public void init() {
		
		this.formula = new Formula() {
			
			@Override
			public double calculate(int a) {
				
				return this.sqrt(a);
			}
		};
	}
	
	@Test
	public void testCalculate() {
		
		assertEquals(10.0, this.formula.calculate(100), DELTA);
	}

	@Test
	public void testSqrt() {
		
		assertEquals(10.0, this.formula.sqrt(100), DELTA);		
	}

}
