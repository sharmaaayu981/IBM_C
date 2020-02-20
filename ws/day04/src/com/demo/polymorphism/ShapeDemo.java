package com.demo.polymorphism;

abstract class Shape {
	public abstract float getArea();

	public abstract float getPerimeter();

	public abstract void draw();
}

class Circle  extends Shape{
	int r;

	public float getArea() {
		return 0.0f;
	}

	public float getPerimeter() {
		return 0.0f;
	}

	public void draw() {
		System.out.println("Drawing circle...");
	}
}

class Rectangle extends Shape {
	int h;
	int w;

	public float getArea() {
		return 0.0f;
	}

	public float getPerimeter() {
		return 0.0f;
	}

	public void draw() {
		System.out.println("Drawing rectangle...");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();

//		c.draw();
//		r.draw();
		
		Shape shape = new Circle();
		shape.draw();
		
		shape = new Rectangle();
		shape.draw();
	}

}
