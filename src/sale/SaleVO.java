package sale;

public class SaleVO {
	private int no;//��ǰ��ȣ
	private String name;//��ǰ��
	private int price;//�ǸŴܰ�
	private int qnt; //�Ǹż���
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	@Override
	public String toString() {
		return "SaleVO [no=" + no + ", name=" + name + ", price=" + price + ", qnt=" + qnt + "]";
	}
}
