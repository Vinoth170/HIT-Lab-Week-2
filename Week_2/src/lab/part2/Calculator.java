package lab.part2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num1,num2,res=0;
		int opr;
		
		System.out.print("Enter first number: ");
		num1=scan.nextDouble();
		
		System.out.print("Enter second number: ");
		num2=scan.nextDouble();
		
		System.out.println("Enter Opertor\n1. addition\t2. subtraction\t3. multiplication\t4. division");
		opr=scan.nextInt();
		
		switch (opr){
		case 1:
			res=num1+num2;
			break;
		case 2:
			res=num1-num2;
			break;
		case 3:
			res =num1*num2;
			break;
		case 4:
			res=num1/num2;
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		System.out.println("Result: "+res);
	}
}
