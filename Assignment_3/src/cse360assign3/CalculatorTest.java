package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/** JUnit test cases Calculator.java
 * @author Ireen Khan
 * @version February 9, 2016
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
		
		assertEquals(1, calc.getTotal());
	}
	
	@Test
	/**Tests the sum**/
	public void returnSum(){
		Calculator calc = new Calculator();
		
		calc.add(3);
		
		assertEquals(1, calc.getTotal());
	}
	
	@Test
	/**Tests the difference*/
	public void returnDiff(){
		Calculator calc = new Calculator();
		
		calc.subtract(3);

		assertEquals(1, calc.getTotal());
	}
	
	@Test
	/**Tests the product*/
	public void returnProd(){
		Calculator calc = new Calculator();
		
		calc.multiply(3);

		assertEquals(1, calc.getTotal());
	}
	
	@Test
	/**Tests the quotient*/
	public void returnDiv(){
		Calculator calc = new Calculator();
		
		calc.divide(3);

		assertEquals(1, calc.getTotal());
	}
	
	@Test
	/**Shows the calculation history*/
	public void returnHist(){
		Calculator calc = new Calculator();
		
		assertEquals("1 + 3", calc.getHistory());
	}

}
