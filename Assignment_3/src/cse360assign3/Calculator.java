package cse360assign3;


/** Performs arithmetic calculations on given integers
 * @author Ireen Khan
 * @version February 21, 2016
 * 
 */

public class Calculator {

	private int total;
	public String histTrack;
	
	/** Create a calculator where no arithmetic operations have been performed, total is 0 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		histTrack = ""; //stores calculation changes in a string
	}
	
	/** Returns the total */
	public int getTotal () {
		return total;
	}
	
	/** Sums the total and the value
	 *  @param value	number to be added to the total
	 */
	public void add (int value) {
		
		total = total + value;
		histTrack = histTrack + " + " + value;
		
	}
	
	/** Finds the difference between the total and value
	 *  @param value	number to be subtracted from the total
	 */
	public void subtract (int value) {
		
		total = total - value;
		histTrack = histTrack + " - " + value;
		
	}
	
	/** Finds product of the total and value
	 *  @param value	number that total will be multiplied with
	 */
	public void multiply (int value) {
		
		total = total * value;
		histTrack = histTrack + " * " + value;
		
	}
	
	/** Finds the quotient of total and the given value
	 *  @param value	number by which the total will be divided
	 */
	public void divide (int value) {
		
		if(value == 0){
			total = 0;
		}else{
			total = total / value;
		}
		histTrack = histTrack + " / " + value;
		
	}
	
	/** Shows the calculations that have been performed*/
	public String getHistory () {
		String history = "0";
		
		history = history + histTrack;
		
		return history;
	}
}
