package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/** JUnit test cases Calculator.java
 * @author Ireen Khan
 * @version February 21, 2016
 * 
 */

public class CalculatorTest {

	@Test
	public void testCalculator(){
		
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	/**Tests what the total is**/
	public void returnTot(){
		Calculator calc = new Calculator();
		
		calc.add(1);
		
		assertEquals(1, calc.getTotal());
	}
	
	@Test
	/**Tests the sum**/
	public void returnSum(){
		Calculator calc = new Calculator();
		
		calc.add(3);
		calc.add(4);
		calc.add(0);
		
		assertEquals(7, calc.getTotal());
	}
	
	@Test
	/**Tests the difference*/
	public void returnDiff(){
		Calculator calc = new Calculator();
		
		calc.add(7);
		calc.subtract(3);

		assertEquals(4, calc.getTotal());
	}
	
	@Test
	/**Tests the product*/
	public void returnProd(){
		Calculator calc = new Calculator();
		
		calc.add(1);
		calc.multiply(3);

		assertEquals(3, calc.getTotal());
	}
	
	@Test
	/**Tests the quotient*/
	public void returnDiv(){
		Calculator calc = new Calculator();
		
		calc.add(9);
		calc.divide(3);

		assertEquals(3, calc.getTotal());
	}
	
	@Test
	/**Tests the quotient when value is zero*/
	public void divByZero(){
		Calculator calc = new Calculator();
		
		calc.add(9);
		calc.divide(0);

		assertEquals(0, calc.getTotal());
	}
	
	@Test
	/**Shows the calculation history*/
	public void returnHist(){
		Calculator calc = new Calculator();
		
		assertEquals("", calc.getHistory());
	}

}
