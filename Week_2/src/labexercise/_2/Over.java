package labexercise._2;

class Base5{
	private void amethod(int iBase) {
		System.out.println("Base.amethod");
	}
}

class Over extends Base5 {
	public static void main(String[] args) {
		Over o=new Over();
		int iBase=0;
		o.amethod(iBase);
	}
	public void amethod(int iOver) {
		System.out.println("Over.amethod");
	}
}
//Outuput of "Over.amethod"