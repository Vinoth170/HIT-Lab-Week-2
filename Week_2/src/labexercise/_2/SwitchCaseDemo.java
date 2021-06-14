package labexercise._2;

/*
 * This program will be print
 * one
 * two
 * default
 */

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int i=1;
		switch(i) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		default:
			System.out.println("default");
		}
	}
}