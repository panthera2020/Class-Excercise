import java.util.Scanner;

public class RectangleTest {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		Rectangle myRectangle = new Rectangle(0.0,0.0);

		System.out.println("Get the area of rectangle");
		System.out.println();

		System.out.println("Enter width: ");
		double width = input.nextDouble();

		System.out.println();
		System.out.println("Enter height: ");
		double height = input.nextDouble();

		myRectangle.setWidth(width);
		myRectangle.setHeight(height);

		myRectangle.calculateArea();

		System.out.println();
		System.out.println("Area: " + myRectangle.getArea());
	}
}