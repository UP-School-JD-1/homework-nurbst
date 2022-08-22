package Ch12;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(10);

		Rectangle r1 = new Rectangle(20, 30);
		Rectangle r2 = new Rectangle(25, 50);

		Square s1 = new Square(8);
		Square s2 = new Square(8);

		Triangle t1 = new Triangle(9, 10, 11);
		Triangle t2 = new Triangle(9, 10, 11);

		c1.draw();
		c1.calculateArea();
		c1.calculateCircumference();
		c1.erase();
		System.out.println("Circle1 hashCode = " + c1.hashCode());
		System.out.println("Circle1 hashCode = " + c2.hashCode());
		System.out.println("Circle1 and Circle2 are equals = " + c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println();

		r1.draw();
		r1.calculateArea();
		r1.calculateCircumference();
		r1.erase();
		System.out.println("Rectangle1 hashCode = " + r1.hashCode());
		System.out.println("Rectangle2 hashCode = " + r2.hashCode());
		System.out.println("Rectangle1 and Rectangle2 are equals = " + r1.equals(r2));
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println();

		s1.draw();
		s1.calculateArea();
		s1.calculateCircumference();
		s1.erase();
		System.out.println("Square1 hashCode = " + s1.hashCode());
		System.out.println("Square2 hashCode = " + s2.hashCode());
		System.out.println("Square1 and Square2 are equals  = " + s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println();

		t1.draw();
		t1.calculateArea();
		t1.calculateCircumference();
		t1.erase();
		System.out.println("Triangle1 hashCode = " + t1.hashCode());
		System.out.println("Triangle2 hashCode = " + t2.hashCode());
		System.out.println("Triangle1 and Triangle2 are equals = " + t1.equals(t2));
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}