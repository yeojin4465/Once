package collection.no01;

public class B {

	private String fruit;
	private int count;
	
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public B(String fruit, int count) {
		this.fruit = fruit;
		this.count = count;
	}
	
	public void plain(String fruit, int count) {
		System.out.println("���� " + fruit + "��  " +  count + "�� ��ȹ�� �ִµ� �� �𸣰ڴϿ�...");
	}
	
	public void showB() {
		System.out.println("B : "+ fruit + ", " +count);
	}
	
	public void sell(int count) {
		this.count-=count;
	}
	
}
