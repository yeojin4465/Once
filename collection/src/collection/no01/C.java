package collection.no01;

public class C extends A{

	private String fruit;
	private int count;
	
	public C() {

	}
	
	public C(String fruit, int count) {
		this.fruit = fruit;
		this.count = count;
	}
	
	
	public void plain(String fruit) {
		System.out.println("저의 부부는 " + fruit + "을 팔 계획이 있습니다.");
	}
	
	
	public void showA() {
		System.out.println("C : "+ fruit + ", " +count);
	}
	
	public void sell(int count) {
		this.count-=count;
	}
}
