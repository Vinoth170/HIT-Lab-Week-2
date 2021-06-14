package lab.part2;

import java.util.Scanner;

public class Fibonacci {
	
	static int f1=0,f2=1;
	
	public static void main(String []argv) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("---Fibonacci Series---");
		
		System.out.print("\nEnter a number: ");
		int num=scan.nextInt(),temp;
		scan.close();
		
		System.out.print("The Fibonacci Series: ");
		System.out.printf("%d %d ",f1,f2);
		
		for(int i=3;i<=num;i++) {
			temp=f2;
			f2=f1+f2;
			f1=temp;
			System.out.printf("%d ",f2);
		}
	}
}
