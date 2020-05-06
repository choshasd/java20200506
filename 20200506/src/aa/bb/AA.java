package aa.bb;

public class AA {
	AA(){
		System.out.println(" 기본생성자 덮어쓰기 ");
	}
	public static void main(String[] args) {
		AA aa1 =new AA();
		
		cc.dd.AA aa2 = new cc.dd.AA();
		aa2.doA();
	}
}
