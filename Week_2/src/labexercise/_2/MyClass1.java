package labexercise._2;

public class MyClass1 {
	public static void main(String arguments[]) {
		amethod(arguments);//error: Can't make static reference to void method
		//To access the method we need to create an object
	}
	public void amethod(String[] arguments) {
		System.out.println(arguments);
		System.out.println(arguments[1]);
	}
}
