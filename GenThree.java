/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int min = Integer.valueOf(args[0]); 
		int max = Integer.valueOf(args[1]);
		int i = 0;
		int[] numberArray = new int[3];
		while( i < 3 ){
	        	numberArray[i] = (int)(Math.random() * (max - min) + min);
			i = i + 1;
		}
		int minNumber = Math.min(numberArray[0], numberArray[1]);
		minNumber = Math.min(numberArray[2], minNumber);
		System.out.println(numberArray[0] + "\n" + numberArray[1] + "\n" + numberArray[2] + "\n" + "The minimal generated number was "+ minNumber);
	}
}
