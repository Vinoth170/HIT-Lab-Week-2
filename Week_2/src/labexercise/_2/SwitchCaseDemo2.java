package labexercise._2;

/*
 * This program will print
 * default
 * zero
 */

public class SwitchCaseDemo2 {
	public static void main(String[] args) {
		int i =9;
		switch(i) {
		default:
			System.out.println("default");
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		}
	}
}