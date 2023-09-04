import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		
		//Tutorial Section
		//double x = 3.14;
		//double y = -10;
		
		//double z = Math.max(x, y); //Assign the maximum number to Z
		//double z = Math.min(x, y); //Assign the smallest number to Z
		//double z = Math.abs(y); //Assign to Z the absolute value o Y, like |-1| = 1
		//double z = Math.sqrt(y); //Square root of Y, no negative numbers
		//double z = Math.round(x); //Round value
		//double z = Math.ceil(x); // Round value up
		//double z = Math.floor(x); // Round value down
		
		//System.out.println(z);
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
		scanner.close(); //Good practice to close the scanner
	}
}
