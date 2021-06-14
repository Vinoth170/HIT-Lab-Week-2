package lab.part2;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		int _min=0,_max=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many numbers you would like to compare?");
		int num =scan.nextInt();
		int []arr=new int[num];
		System.out.println("Enter the values: ");
		
		//Find the minimum and maximum
		for(int i=1;i<num;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		for(int i=1;i<num-1;i++) {
			_min=Math.min(arr[i], arr[i+1]);
			_max=Math.max(arr[i],arr[i+1]);
		}
		
		System.out.printf("The maximum value is %d...\nThe minimum value is %d...",_max,_min);
	}
}
