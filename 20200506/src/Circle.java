
public class Circle {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		rad = r;
	}
	public double getArea() {
		return rad*rad*PI;
	}
	public void setRad(double r) {
		if(r<0) {
			rad = 0;
			return;
		}
		rad = r;
		// 이함수를 씀으로써 반지름을 음수로 넣었을때 값이 나오는 걸 방지
		// class를 나누고 rad를 private double rad로 지정해주면 바로 반지름을 설정하지 못하도록 한다
		// java 9장
	}
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println("반지름 1.5의 원넓이 = "+c.getArea());
		
		c.setRad(2.5);
		System.out.println("반지름 2.5의 원넓이 = "+c.getArea());
		c.setRad(-1);
		System.out.println("반지름 "+c.rad+"의 원넓이 = "+c.getArea());
	}
		
}
