package rectangleTest;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y + ")에서 크기가 "+ width + "X" + height + "인 사각형");
	}
	
	public  int  square() {
		int area = width * height;
		return area;
	}
	
	public boolean contains(Rectangle s) {
		if((s.x + s.width <= this.x + this.width) && (s.y + s.height <= this.y + this.height) && (s.x >= this.x) && (s.y >= this.y)) {
			return true;
		}
		else {
			return false;
		}
	
	}
}
