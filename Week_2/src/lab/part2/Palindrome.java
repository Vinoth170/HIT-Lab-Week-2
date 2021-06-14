package lab.part2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str=scan.nextLine(),str1="";
		scan.close();
		char arr[]=str.toCharArray();
		
		//Reverse the string
		for(char i:arr) {
			str1=i+str1;
		}
		
		//Check for palindorme
		if(str1.equalsIgnoreCase(str))
			System.out.println("The given string is palindrome");
		else
			System.out.println("The given string is not a palindrome");
	}
}
