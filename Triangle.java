/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here
		int sideOne = Integer.valueOf(args[0]);
		int sideTwo = Integer.valueOf(args[1]);
		int sideThree = Integer.valueOf(args[2]);
		String isTriangle = "false";
		if ( ((sideOne + sideTwo) > sideThree ) && ((sideOne + sideThree) > sideTwo) && ((sideTwo + sideThree) > sideOne)){
			isTriangle = "true";
		}
		System.out.println(sideOne + ", " + sideTwo + ", " + sideThree + ": " + isTriangle);
		
	}
}
