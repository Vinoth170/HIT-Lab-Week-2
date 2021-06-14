package labexercise._2;

public class Scope1 {
	private int i;
	public static void main(String[] args) {
		Scope1 s=new Scope1();
		s.amethod();
	}
	public void amethod() {
		// A value of 0 will be printed out
		System.out.println(i);
	}
}