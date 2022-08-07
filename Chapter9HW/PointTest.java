package Chapter9;

public class PointTest {
	
	public static void main(String[] args) {
		
		Point p1= new Point(35,45);
		Point p2= new Point(50,45);
		
		System.out.println("P1 degerleri"+" x: " +p1.x +" y:  "+ p1.y);
		System.out.println("P2 degerleri"+" x: " +p2.x +" y:  "+ p2.y);
		
		p1.setX(35);
		p1.setY(45);
		p2.setX(50);
		p2.setY(45);
		
		double distance = p1.distanceFromAnotherPoint(p2);
		System.out.println("Iki nokta arasi uzaklik:"+ distance);
		double origin=p1.distanceFromTheOrigin();
		System.out.println("P1 in orjine uzaklığı:  "+origin );
		
		Point p3 = p1.clone();
		p3.move('y',20);
		System.out.println("P3 Degerleri :  "+" x: " +p3.x +" y:  "+ p3.y);
		
		p1.move('x', 5);
		System.out.println("P1 degerleri"+" x: " +p1.x +" y:  "+ p1.y);
		
		p2.move('y', 10);
		System.out.println("P2 degerleri"+" x: " +p2.x +" y:  "+ p2.y);
		
		
	}
	
	
	
}