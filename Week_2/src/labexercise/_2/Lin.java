package labexercise._2;

public class Lin {
	public static void main(String[] args) {
		Lin l=new Lin();
		l.amethod();
	}
	public void amethod() {
		int ia[]= new int[4];
		for(int i=0;i<ia.length;i++) {
			ia[i]=i;
			System.out.println(ia[i]);
		}
	}
}
