package lab.part2;

import java.util.Scanner;

public class SeasonSwitchCase {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter month in number: ");
		int month=scan.nextInt();
		String str1="It's Winter...!",str2="It's Summer...!",str3="It's Monsoon...!",str4="It's Autum...!";
		
		switch (month){
		case 1:
			System.out.println(str1);
			break;
		case 2:
			System.out.println(str1);
			break;
		case 3:
			System.out.println(str2);
			break;
		case 4:
			System.out.println(str2);
			break;
		case 5:
			System.out.println(str2);
			break;
		case 6:
			System.out.println(str3);
			break;
		case 7:
			System.out.println(str3);
			break;
		case 8:
			System.out.println(str3);
			break;
		case 9:
			System.out.println(str3);
			break;
		case 10:
			System.out.println(str4);
			break;
		case 11:
			System.out.println(str4);
			break;
		case 12:
			System.out.println(str1);
			break;
		default:
			System.out.println("Invalid Month...!");
			break;
		}
	}
}
