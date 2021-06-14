package labexercise._2;

private class Base3 {//Error at compile time
	Base3(){
		int i=100;
		System.out.println(i);
	}
}
public class Pri extends Base3{
	static int i =200;
	public static void main(String[] args) {
		Pri p=new Pri();
		System.out.println(i);
	}
}
