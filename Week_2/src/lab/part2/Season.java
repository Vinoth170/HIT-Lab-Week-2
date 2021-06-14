package lab.part2;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter month in number: ");
		int month=scan.nextInt();
		
		if(month==12||month==1||month==2)
			System.out.println("It's Winter...!");
		else if(month==3||month==4||month==5)
			System.out.println("It's Summer...!");
		else if(month==6||month==7||month==8||month==9)
			System.out.println("It's Monsoon...!");
		else if(month==10||month==11)
			System.out.println("It's Autum...!");
		else
			System.out.println("Invalid Month...!");
	}
}
