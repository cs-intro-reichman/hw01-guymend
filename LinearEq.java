/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
	// Put your code here
		double a = Double.valueOf( args[0] );
		double b = Double.valueOf( args[1] );
		double c = Double.valueOf( args[2] );
		double result = (c-b) / a;
		System.out.println( a + " * x " + b + " = " + c );
		System.out.println( "x = " + result);
	}
}
