package Ch12;

public class Shape {
	public double circumference;
	public double area;
	public String shapeName;
	
	public Shape(String name){
		this.shapeName=name;
	}
	
	
	public String getName() {
		return shapeName;
	}


	public void setName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	void draw() {
		System.out.println(shapeName+"has been drawn");
	}
	void erase() {
		System.out.println(shapeName+"has been erased");
	}
	double calculateArea() {
		System.out.println("Area of "+shapeName+ " " + area);
		return area;
	}
	double calculateCircumference() {
		System.out.println("Area of "+shapeName+ " " + circumference);
		return circumference;
	}
}