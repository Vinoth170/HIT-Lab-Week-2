package lab.part2;

public class InheritanceDemo extends B{
	public InheritanceDemo() {
		System.out.println("Child class....");
	}
	public static void main(String[] args) {
		System.out.println("Example for multilevel inheritance");
		A obj=new InheritanceDemo();
		System.out.println();
		System.out.println("Example for simple inheritance");
		B obj1=new InheritanceDemo();
	}
}

class A{
	A(){
		System.out.println("Parent's parent class....");
	}
}

class B extends A{
	B(){
		System.out.println("Parent class....");
	}
}