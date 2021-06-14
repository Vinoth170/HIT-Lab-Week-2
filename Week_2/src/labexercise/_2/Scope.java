package labexercise._2;

class Base{
	public void amethod(int i) {}
}
public class Scope extends Base{
	public static void main(String[] args) {
	}
	//We can use either of the following methods to override the method called amethod in superclass
	//void amethod(long i)throws Exception{}
	//void amethod(long i){}
}
