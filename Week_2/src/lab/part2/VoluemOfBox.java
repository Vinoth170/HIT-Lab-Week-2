package lab.part2;

import java.util.Scanner;

public class VoluemOfBox {
	public static void main(String[] args) {
		VoluemOfBox obj=new VoluemOfBox();
		float length, width, height, volume;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length, height and width of a box");
		length=scan.nextFloat();
		height=scan.nextFloat();
		width=scan.nextFloat();
		volume=obj.volume(length, height, width);
		System.out.println("Volume of the box: "+volume);
	}
	public float volume(float l, float h, float w) {
		return l*h*w;
	}
}
