package collection.no01;

public class A {
	
	private String fruit;
	private int count;
	
	public A() {

	}
	
	public A(String fruit, int count) {
		this.fruit = fruit;
		this.count = count;
	}
	
	
	public void plain(String fruit) {
		System.out.println("나는 " + fruit + "을 팔 계획이 있습니다.");
	}
	
	public void plain(String fruit, int count) {
		System.out.println("나는 " + fruit + "을  " +  count + "팔 계획이 있습니다.");
	}
	
	public void showA() {
		System.out.println("A : "+ fruit + ", " +count);
	}
	
	public void sell(int count) {
		this.count-=count;
	}
}	
