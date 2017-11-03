package collection.no01;

public class Main {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		C c = new C();
		A d = new C();
		
		
		c.plain("사과"); // 출력 값을 작성
		c.plain("사과", 10); // 출력 값을 작성
		
		
		//"나는 포도를 20개 팔 계획이 있습니다"가 출력되려면??
		((A)d).plain("포도");
		
		((C)a).plain("파인애플");
		
		((A)c).plain("포도");
		
		
		
		
	}

}
