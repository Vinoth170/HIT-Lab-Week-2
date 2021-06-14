package lab.part2;

import java.util.Scanner;

public class PrimeDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		scan.close();
		
		boolean flag = false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				flag=true;
		}
		if(flag)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is a prime number");
	}
}