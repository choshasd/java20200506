class Point{
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[ "+xPos+", "+yPos+" ]");
		
	}
}
class Circle2{
	int rad;
	Point center;
	// class Point에 center
	
	public Circle2(int x, int y, int r) {
		center = new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("원의 반지름 : "+ rad);
		System.out.println("원의 넓이 : "+(3.14*rad*rad));
		center.showPointInfo();
	}
}
public class Q1_216page {
	public static void main(String[] args) {
		Circle2 c = new Circle2(2, 2, 4);
		c.showCircleInfo();
	}
}
