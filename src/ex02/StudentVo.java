package ex02;

//datebase Accsee object 데이터에 접근하기 위한 객체

public class StudentVo {

	private int no;
	private String name;
	private String tel;
	private String juso;
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	
	public void pint() {
		System.out.println(no+"\t"+name+"\t"+tel+"\t"+juso+"\n");
		
		
	}
	@Override
	public String toString() {
		return "StudentVo [no=" + no + ", name=" + name + ", tel=" + tel + ", juso=" + juso + "]";
	}
	
	
	
}
