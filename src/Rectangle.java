
public class Rectangle implements Shape{
	
	
	int a;
	int b;
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	
	
	
	

	public int area() {
	return  a * b;
}

	public int perimeter() {
	return 2*a + 2*b;
	}
}

