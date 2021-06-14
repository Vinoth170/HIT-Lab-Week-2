package labexercise._2;

public class Prog33 {
	public static void main(String[] args) {
		Prog33 obj=new Prog33();
		obj.run();
	}
	int i=0;
	public int run() {
		while(true) {
			i++;
			System.out.println("i="+i);
		}
		return 1;
	}
}
//This program will throw error at compile time