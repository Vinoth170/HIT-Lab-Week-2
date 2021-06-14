package labexercise._2;

public class Ref {
	public static void main(String[] args) {
		Ref r=new Ref();
		r.amethod(r);
	}
	public void amethod(Ref r) {
		int i=99;
		multi(r);
		System.out.println(i);
	}
	public void multi(Ref r) {
		r.i=r.i*2;//error at compile time
	}
}
