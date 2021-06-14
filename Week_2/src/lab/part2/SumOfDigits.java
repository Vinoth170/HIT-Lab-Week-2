package lab.part2;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("*** Sum Of Digits ***");
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enther digits: ");
		int val= scan.nextInt(),sum=0;
		scan.close();
		
		while(val>0) {
			sum+=val%10;
			val/=10;
		}
		System.out.println("Sum of the digits: "+sum);
	}
}
