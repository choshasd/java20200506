
public class RectMain {
	public static void main(String[] args) {
		Rect r1 = new Rect();
		
		//r1.width = 100;�� �ٷ� ������ (private)
		//Rect.java���� public ���� ����
		// public > protected > default > private
		r1.setWidth(100);
		System.out.println(r1.getWidth());
	}
}
