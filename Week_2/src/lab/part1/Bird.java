package lab.part1;

public class Bird {
	int age;
	String name;
	
	//Constructor without parameters
	Bird(){
		System.out.println("This is the parrot");
	}
	
	//Constructor with string parameter
	Bird(String x){
		name =x;
		System.out.println("This is the "+name);
	}
	
	//Constructor with two different parameters
	Bird(int y, String z){
		age =y;
		name= z;
		System.out.println("This is the "+age+" years "+name);
	}
	public static void main(String[] args) {
		Bird a=new Bird();
		//a.Bird();
		Bird d=new Bird("maina");
		Bird c=new Bird(20,"sparrow");
	}
}
