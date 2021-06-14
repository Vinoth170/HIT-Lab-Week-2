package lab.part2;

import java.util.Scanner;

public class AssState {
	
	public static void main(String[] args) {
		
		Area obj1=new Area();
		obj1.area();
		TotalEnergy obj2=new TotalEnergy();
		obj2.totalEnergy();
	}
	
	

}
class Area{
	public void area() {
		
		Scanner scan=new Scanner(System.in);
		
		double r,h,area;
		
		System.out.println("--- Area of a cone ---\n");
		
		System.out.println("Enter radius: ");
		r=scan.nextDouble();
		
		System.out.println("Enter height: ");
		h=scan.nextDouble();
		
		area=Math.PI*r*r+2*Math.PI*r*h;
		System.out.println("Area of the cone:"+area+"\n");
		
	}
}
class TotalEnergy{
	
	public void totalEnergy(){
		
		double m,a,h,v;
		Scanner scan=new Scanner(System.in);
		System.out.println("--- Total Energy ---\n");
		
		System.out.println("Enter mass of an object: ");
		m= scan.nextDouble();
		
		System.out.println("Enter height: ");
		h= scan.nextDouble();
		
		System.out.println("Enter acceleration due to gravity: ");
		a= scan.nextDouble();

		System.out.println("Enter velocity: ");
		v=scan.nextDouble();
		
		TotalEnergy obj=new TotalEnergy();
		double val1= obj.pe(m,h,a);
		
		double val2= obj.ke(m,v);
		double totalEnergy=val1+val2;
		
		System.out.println("Total Energy: "+totalEnergy);
	}
	private double pe(double m, double h, double a) {
		
		double pe=m*a*h;
		
		System.out.println("Potential energy: "+pe+"\n");
		
		return pe;
	}
	private double ke(double m, double v) {
				
		double ke=m*v*v/2;
		
		System.out.println("Kinetic energy: "+ke+"\n");
		
		return ke;
	}
}
