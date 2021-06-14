package lab.part1;

public class Add {
	public static void main(String[] args) {
		int [][] x= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int [][] y= {
				{11,12,13},
				{14,15,16},
				{17,18,19}
		};
		int [][] z= new int[3][3];
		
		//Add the matrices x and y and store it in matrix z
		for(int i=0;i<3;i++)
			for (int j=0;j<3;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		
		//Print the matrix z
		for(int i=0;i<3;i++) {
			System.out.print("| ");
			for(int j=0;j<3;j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.print("|\n");
		}
	}
}
