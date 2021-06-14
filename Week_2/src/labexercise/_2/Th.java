package labexercise._2;
import java.io.*;

public class Th {
	public static void main(String[] args) {
		Th t=new Th();
		t.amethod();
	}
	public void amethod() {
		try {
			ioCall();
		}
		catch(IOException ioe) {}
	}
	public void ioCall() throws IOException {
		DataInputStream din=new DataInputStream(System.in);
		din.readChar();
	}
}
