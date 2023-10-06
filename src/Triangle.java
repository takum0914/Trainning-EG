
public class Triangle implements Shape{
	
	int w;
	int h;
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
		
	}
	
	public int area() {
		return w*h/2;
	}
	
	public int perimeter() {
		return 3*w;
	}
}
