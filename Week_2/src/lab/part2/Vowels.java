package lab.part2;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char chr=scan.next().toLowerCase().charAt(0);
		boolean flag=false;
		
		if(chr>='a' && chr<='z') {
			switch (chr){
			case 'a':
				flag=true;
				break;
			case 'e':
				flag=true;
				break;
			case 'i':
				flag=true;
				break;
			case 'o':
				flag=true;
				break;
			case 'u':
				flag=true;
				break;
			default:
				flag=false;
				break;
			}
			if(flag)
				System.out.println("It's a vowel");
			else
				System.out.println("It's not a vowel");
		}
		else
			System.out.println("Enter valid character");
		
	}
}
