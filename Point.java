package Chapter9;
public class Point{
	
	int x;
	int y ;
	
	public Point(int x , int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distanceFromTheOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	public double distanceFromAnotherPoint(Point point) {
		return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
	}
	
	public Point clone() {
		Point point = new Point(x, y);
		return point;
	}
	
	public void move(char direction , int quantity) {
		if(direction =='x') {
			x += quantity;
		}
		else if(direction=='y') {
			y += quantity;
		}
		
	}
	
}