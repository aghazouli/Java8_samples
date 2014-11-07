package org.rygn;

public class FormulaImpl implements Formula {

	@Override
	public double calculate(int a) {
		
		return this.sqrt(a * 100);
	}

	public double sqrt(int a) {
        return (Math.sqrt(a) + 1000.0);
    }
}
