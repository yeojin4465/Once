package collection.no01;

public class Main {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		C c = new C();
		A d = new C();
		
		
		c.plain("���"); // ��� ���� �ۼ�
		c.plain("���", 10); // ��� ���� �ۼ�
		
		
		//"���� ������ 20�� �� ��ȹ�� �ֽ��ϴ�"�� ��µǷ���??
		((A)d).plain("����");
		
		((C)a).plain("���ξ���");
		
		((A)c).plain("����");
		
		
		
		
	}

}
