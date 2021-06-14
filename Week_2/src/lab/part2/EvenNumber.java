package lab.part2;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Enter a number to find even number up to the range
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		scan.close();
		
		for(int i=1; i<=num; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}
