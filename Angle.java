package com;

public class Angle {

	public static void main(String[] args) {
		
		double angle = refAngle(0,-20,0,0,200,-40);

		System.out.println( angle );

	}
	
	public static double refAngle(double x1, double y1, double x2, double y2, double x3, double y3) {
		double x21=x2-x1;
		double x32=x3-x2;
		double y21=y2-y1;
		double y32=y3-y2;
		double measure;
		double sqrt21 = Math.sqrt(x21*x21+y21*y21);
		double sqrt32 = Math.sqrt(x32*x32+y32*y32);
		
		
		
	
	
		
		 measure=Math.PI-Math.acos( (x21*x32+y21*y32)/(sqrt21*sqrt32) );
		 return measure;
			
	  }
	
}