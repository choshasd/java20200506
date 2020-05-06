
public class RectMain {
	public static void main(String[] args) {
		Rect r1 = new Rect();
		
		//r1.width = 100;을 바로 못넣음 (private)
		//Rect.java에서 public 수준 지정
		// public > protected > default > private
		r1.setWidth(100);
		System.out.println(r1.getWidth());
	}
}
