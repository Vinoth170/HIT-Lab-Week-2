package labexercise._2;

class Base2{
	Base2(int i){
		System.out.println("base constructor");
	}
	Base2(){
	}
}
public class Sup extends Base2 {
	public static void main(String[] args) {
		Sup s= new Sup();
		//One
	}
	Sup() {
		//Two
		super(10);
	}
	public void derived() {
		//Three
	}
}