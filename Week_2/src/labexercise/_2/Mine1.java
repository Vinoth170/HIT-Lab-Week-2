package labexercise._2;

import java.io.*;

public class Mine1 {
	public static void main(String[] args) {
		Mine1 m =new Mine1();
		System.out.println(m.amethod());
	}
	public int amethod() {
		try {
			FileInputStream dis =new FileInputStream("Hello.txt");
		}
		catch(FileNotFoundException fne) {
			System.out.println("No such file found");
			return -1;
		}
		catch(IOException ioe) {}
		finally {
			System.out.println("Doing finally");
		}
		return 0;
	}
}
// The output will be "No such file found, Doing finally, -1"