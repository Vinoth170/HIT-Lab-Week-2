package lab.part2;

import java.util.Scanner;

public class PatternDemo {
	static int n=1;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int num=scan.nextInt();
		scan.close();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d ",n);
				n++;
			}
			System.out.println();			
		}
		System.out.println();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d ",0);
			}
			System.out.println();
		}
	}
}
