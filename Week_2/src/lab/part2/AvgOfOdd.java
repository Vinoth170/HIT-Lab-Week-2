package lab.part2;

import java.util.Scanner;

public class AvgOfOdd {
	public static void main(String[] args) {
		System.out.println("Program to find average of odd number below range");
		Scanner scan=new Scanner(System.in);
		
		//Enter a number
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		scan.close();
		
		int sum=0;
		int num1=0;
		
		for(int i=1;i<num;i++) {
			if(i%2!=0) {
				sum+=i;
				num1++;
			}
		}
		int avg=sum/num1;
		System.out.println("Average of Odd number below range: "+avg);
	}
}
