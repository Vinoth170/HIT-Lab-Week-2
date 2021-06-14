package lab.part2;

import java.util.Scanner;

public class SqrRec {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SqrRec obj1=new SqrRec();
		
		System.out.print("Enter side of a square: ");
		double side=scan.nextDouble();

		double area =obj1.area(side);
		System.out.printf("Area of the square: %.3f\n",area);
		
		double peri=obj1.perimeter(side);
		System.out.printf("Perimeter of the square: %.3f\n",peri);
		
		System.out.println("\nEnter height and width of a rectangle: ");
		double height=scan.nextDouble();
		double width =scan.nextDouble();
		
		area = obj1.area(height, width);
		System.out.printf("Area of the rectangle: %.3f\n",area);
		
		peri=obj1.perimeter(height, width);
		System.out.printf("Perimeter of the rectangel: %.3f\n",peri);
	}
	private double area(double a) {
		return a*a;
	}
	private double area(double a, double b) {
		return a*b;
	}
	private double perimeter(double a) {
		return 4*a;
	}
	private double perimeter(double a, double b) {
		return 2*(a+b);
	}
}
