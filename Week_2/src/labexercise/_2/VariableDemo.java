package labexercise._2;

public class VariableDemo {
	public static void main(String args[]) {
		float f =1.3;//Type mismatch, should use f after value
		char c="a";//Type mismatch, should use single quotes for the char
		byte b=257;//Range of byte is exceed
		boolean d =null;//Type mismatch, can't use null for boolean
		int i=10;//This line alone compile without warning or error
	}

}
