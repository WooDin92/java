package ex02;

public class ScoreVO {

	private int no;
	private String name;
	private int grade;
	
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void prin() {
		System.out.printf("��ȣ : %d\t �̸� : %s\t ���� : %d\n",no,name,grade);
		
	}
	
	
	
}
