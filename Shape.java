package test2;

public interface Shape {
     void input();
     void area();
}

class Circle implements Shape
{
	int r = 0;
	double pi = 3.14, ar = 0;
	public void input() {
		r= 2;
	}
	public void area() {
		ar = pi * r * r;
		System.out.println("Area of circle:"+ar);
	}
}

class Rectangle extends Circle{
	int l = 5, b = 5;
	double ar;
	public void input() {
		super.input();
		ar = l * b;
		System.out.println("Area of Rectangle:"+ar);
		
	}
	
}