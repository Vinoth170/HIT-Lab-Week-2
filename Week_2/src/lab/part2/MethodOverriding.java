package lab.part2;

public class MethodOverriding extends A1{
	public static void main(String[] args) {
		A1 obj=new MethodOverriding();
		obj.print(1234);
	}
	public void print(int a) {
		System.out.println("Child class..."+a);
		super.print(1234);
	}
}

class A1{
	protected void print(int a) {
		System.out.println("Parent class..."+a);
	}
}
