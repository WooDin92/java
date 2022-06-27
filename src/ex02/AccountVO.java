package ex02;

import java.text.DecimalFormat;

public class AccountVO {
	private int no;
	private String name;
	private int balance;
	DecimalFormat df = new DecimalFormat("#,000��");

	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void print() {
		System.out.printf("���¹�ȣ : %d\t �̸� : %s\t",no,name);
		System.out.println(" �ܾ� : "+df.format(balance) + "\n");
	}
	public void println() {
		System.out.printf("���¹�ȣ : %d\n �̸� : %s\n",no,name);
		System.out.println("�ܾ� : "+df.format(balance) + "\n");
	
	}
}
