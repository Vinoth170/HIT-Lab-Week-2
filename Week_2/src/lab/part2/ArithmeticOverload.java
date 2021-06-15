package lab.part2;

public class ArithmeticOverload {
	public static void main(String[] args) {
			ArithmeticOverload obj=new ArithmeticOverload();
			System.out.println("add(5,6)= "+obj.add(5,6));
			System.out.println("add(5,6,8,19,23)+ "+obj.add(5,6,8,19,23));
			System.out.println("sub(5,6)= "+obj.sub(5,6));
			System.out.println("sub(5,6,8,19,23)+ "+obj.sub(5,6,8,19,23));
			System.out.println("mul(5,6)= "+obj.mul(5,6));
			System.out.println("mul((5,6,8,19,23))+ "+obj.mul(5,6,8,19,23));
			System.out.println("div(5,6)= "+obj.div(5,6));
			System.out.println("div((5,6,8,19,23))+ "+obj.div(5,6,8,19,23));
	}
	public int add(int i,int j) {
		return i+j;
	}
	public int add(int... i) {
		int res=0;
		for(int j:i)
			res+=j;
		return res;
	}
	public int sub(int i, int j) {
		return i-j;
	}
	public int sub(int... i) {
		int res=i[0];
		for(int j=1;j<i.length;j++)
			res-=i[j];
		return res;
	}
	public int mul(int i, int j) {
		return i*j;
	}
	public int mul(int... i) {
		int res=1;
		for(int j:i)
			res*=j;
		return res;
	}
	public float div(float i, float j) {
		return i/j;
	}
	public float div(float... i) {
		float res=i[0];
		for(int j=1;j<i.length;j++)
			res/=i[j];
		return res;
	}
	
}
