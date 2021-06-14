package lab.part2;

import java.util.Scanner;

public class SwapInt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1=scan.nextInt();
		
		System.out.print("Enter second number: ");
		int n2=scan.nextInt();
		scan.close();
		System.out.printf("Before swapping\n1. %d\n2. %d",n1,n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.printf("\nAfter swapping\n1. %d\n2. %d",n1,n2);
	}
}
