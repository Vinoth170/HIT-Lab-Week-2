package labexercise._2;

public class StringDemo {
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("there");
		String s3=new String();
		s3=s1 + s2; // This is the legal operation
//		The following operation are not legal
//		s3=s1 - s2;
//		s3=s1 & s2;
//		s3=s1 && s2;
		System.out.println(s3);
	}
}
