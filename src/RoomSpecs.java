import java.util.Scanner;

public class RoomSpecs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		double length;
		double width;
		double area;
		double perimeter;
		
		System.out.println("Welcome to the Grand Circus Room Sizing Machine!");
		System.out.println("If you make a couple measurements, our machine will tell you some interesting factoids about your classroom.");
		
		
		System.out.println("What's the length of your classroom? (Please enter the number of feet; instead of inches, use a decimal point.)");
		length = scnr.nextDouble();
		
		System.out.println("What's the width of your classroom? (Please enter the number of feet; instead of inches, use a decimal point.)");
		width = scnr.nextDouble();
		
		perimeter = length * 2 + width * 2;
		area = length * width;
		
		System.out.println("The perimeter of your classroom is " + perimeter + " feet.");
		System.out.println("The area of your classroom is " + area + " square feet.");
		
		/*
		System.out.println("Would you like to try to again? Please enter y. If not, please enter n.");
		
		
		*/
	}

}
