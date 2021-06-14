package lab.part2;

import java.util.Scanner;

public class SwapArr extends Swap{
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Swap Arrays without using temporary variable");
		System.out.print("\nHow many number of elements: ");
		int num=scan.nextInt();
		int[] arr1=new int[num],arr2=new int[num];
		SwapArr obj=new SwapArr();
		
		//Generate the arrays
		obj.arrayGen(arr1, num);
		obj.arrayGen(arr2, num);
		
		//Arrays before swapping
		System.out.println("Arrays: ");
		obj.printarr(arr1);
		obj.printarr(arr2);

		//Swap the arrays
		obj.swap(arr1, arr2);
		
		//Arrays after swapping
		System.out.println("Arrays: ");
		obj.printarr(arr1);
		obj.printarr(arr2);
	}
	void arrayGen(int[] a,int n) {
		System.out.println("\nEnter the elements: ");
		for (int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
	}
	void printarr(int[] a) {
		for(int i:a)
			System.out.printf("%d ",i);
		System.out.println();
	}
}

class Swap{
	
	void swap(int[] a,int[] b){
		for(int i=0;i<a.length;i++)
			a[i]=a[i]+b[i];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i]-b[i];
			a[i]=a[i]-b[i];
		}
	}
}
