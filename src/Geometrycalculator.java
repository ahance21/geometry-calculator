import java.util.Scanner;

public class Geometrycalculator 
{

	public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
   Scanner bread = new Scanner(System.in);
   System.out.print("Please enter your name:  ");
	String name;
	name = bread.nextLine();
	System.out.println("\n\nHello, " + name + ", welcome to the Geometry Calculator!");
	System.out.println("Please enter to continue...");
	bread.nextLine();
	System.out.print("Area Of A Triangle");
	System.out.print("Please enter the base:  ");
	String baseStr = bread.nextLine();
	System.out.print("\nPlease enter the height:  ");
	String heightStr = bread.nextLine();
	double base;
	base = Double.parseDouble(baseStr);
	double height = Double.parseDouble(heightStr);
	System.out.print("Please enter the unit of measure:  ");
	String unit = bread.nextLine();
	double area = .5*(base*height);
	System.out.println("The area of the triangle is " + area +" " + unit + "^2");
	}

}
