package lab.part2;

public class ArithmeticConstructorOver {
	public static void main(String[] args) {
		new Add(2, 3);
		new Add(2, 3, 5);
		new Sub(2, 3);
		new Sub(2, 3, 5);
		new Mul(2, 3);
		new Mul(2, 3, 5);
		new Div(2, 3);
		new Div(2, 3, 5);
	}
}
class Add{
	public Add(int a, int b) {
		System.out.printf("Add(%d,%d)=%d\n",a,b,a+b);
	}
	public Add(int a,int b,int c) {
		System.out.printf("Add(%d,%d,%d)=%d\n",a,b,c,a+b+c);
	}
}

class Sub{
	public Sub(int a, int b) {
		System.out.printf("Sub(%d,%d)=%d\n",a,b,a-b);
	}
	public Sub(int a,int b, int c) {
		System.out.printf("Mul(%d,%d,%d)=%d\n",a,b,c,a-b-c);
	}
}

class Mul{
	public Mul(int a, int b) {
		System.out.printf("Mul(%d,%d)=%d\n",a,b,a*b);
	}
	public Mul(int a,int b, int c) {
		System.out.printf("Mul(%d,%d,%d)=%d\n",a,b,c,a*b*c);
	}
}

class Div{
	public Div(float a, float b) {
		System.out.printf("Div(%f,%f)=%f\n",a,b,a/b);
	}
	public Div(float a,float b, float c) {
		System.out.printf("Div(%f,%f,%f)=%f\n",a,b,c,a/b/c);
	}
}
