/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int min = args[0]; 
		int max = args[1];
		int i = 0;
		int numberArray[];
		while( i < 3 ){
	        	int numberArray[i] = (int)Math.floor( Math.random() * (max - min + 1) + min );
			System.out.println( numberArray[i] );
			i = i + 1;
		}
		int minNumber = Math.min( numberArray[0], numberArray[1], numberArray[2] );
		System.out.println( "The minimal generated number was "+minNumber );
	}
}
