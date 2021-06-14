package lab.part2;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int num =scan.nextInt();
		
		System.out.println("Enter your value: ");
		String str[]=new String[num];
		
		for(int i=0; i<num;i++) {
			str[i]=scan.nextLine();
		}
		scan.close();
		
		System.out.print("Reversed array: ");
		for(int i=num-1;i>=0;i--)
			System.out.printf("%s ",str[i]);
	}
}
