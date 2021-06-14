package labexercise._2;

public class IfDemo {
	public static void main(String[] args) {

//The below set of lines will throw error
//		int i=0;
//		if(i) {
//			System.out.println("Hello");
//		}
		boolean b =true;
		boolean b2=true;
		if (b==b2)
			System.out.println("So true");
		int j =1;
		int k=2;
		if(j==1||k==2)
			System.out.println("OK");
		
//The below set of lines will throw error
//		int l=1;
//		int m=2;
//		if(l==1 &| m==2)
//			System.out.println("OK");
	}
}
