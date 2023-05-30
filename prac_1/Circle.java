package prac_1;

import java.util.Scanner;

public class Circle {
	float radius,area,circumference;
	final float PI=(float)Math.PI;
	
	//method
	public void setData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter radius of the circle: ");
		radius = sc.nextFloat();
		circumference = 2*PI*radius;
		area = PI*radius*radius;
	}
	public void getData()
	{
		System.out.println("Radius of circle is "+radius);
		System.out.println("Area of circle is "+area);
		System.out.println("Circumference of circle is "+circumference);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setData();
		c1.getData();
	}

}
