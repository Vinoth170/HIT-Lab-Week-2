package lab.part2;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("---Multiplication table---");
		
		System.out.println("\nWhich multiplication table you want?");
		int num=scan.nextInt();
		scan.close();
		
		for(int i=1;i<=10;i++)
			System.out.printf("%d x %d = %d\n",i,num,i*num);
	}
}
