package org.rygn;



public class MainDefautMethod {

	public static void main(String[] args) {
		
		Formula formula = new Formula() {
			
			@Override
			public double calculate(int a) {
				
				return this.sqrt(a);
			}
		};
					
		System.out.println(formula.calculate(100));
		
		System.out.println(formula.sqrt(100));
		
		System.out.println("--------------------------");
		
		Formula formula2 = new FormulaImpl();
		
		System.out.println(formula2.calculate(100));
		
		System.out.println(formula2.sqrt(100));
	}

}
