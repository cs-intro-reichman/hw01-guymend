/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Put your code here
		int result = Integer.valueOf( args[0] ) + Integer.valueOf( args[1] );	
		System.out.println(args[0] + " + " + args[1] + " = " + result);
	}
}
