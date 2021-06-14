package labexercise._2;

public class MyFor {
	public static void main(String[] args) {
		int i;
		int j;
		outer:
			for (i=1;i<3;i++)
				inner:
					for(j=1;j<3;j++) {
						if(j==2)
							continue outer;
						System.out.println("Value for i="+i+"Value for j="+j);
					}
	}
}
// The output will be 
// Value for i=1 Value for j=1
// Value for i=2 Value for j=1