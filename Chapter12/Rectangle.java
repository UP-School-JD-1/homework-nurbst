package Ch12;

import java.util.Objects;

public class Rectangle extends Shape {

	public double x, y;

	public Rectangle(double x, double y) {
		super("RECTANGLE");
		this.x = x;
		this.y = y;

	}

	@Override
	void draw() {
		super.draw();
		System.out.println("Rectangle Edge 1 : " + x + "\nRectangle Edge 2 : " + y);
	}

	@Override
	void erase() {
		super.erase();
	}

	@Override
	double calculateArea() {
		double area = x * y;
		System.out.println("Rectangle area : " + area);
		return area;
	}

	@Override
	double calculateCircumference() {
		double circumference = 2 * (x * y);
		System.out.println("Rectangle circumference : " + circumference);
		return circumference;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Rectangle [x = " + x + ", y = " + y + "]";
	}

}