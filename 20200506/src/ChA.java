// extends 상속받는다.
//혹시 다른패키지에 있으면 protect int num = 10;으로 입력하면
//접근수준이 다른패키지여도 상속된 ChA에서도 호출가능
public class ChA extends PaA{
	ChA(){
		num = 20;
		System.out.println("num = "+num);
	}
	public static void main(String[] args) {
		new ChA();
	
	}
}
