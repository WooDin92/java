package student;

import java.util.ArrayList;

public interface StudentDAO {
	//������ �ڵ尪���ϱ�
	public int getCode();
	
	//�Է�,���,Create
	public void insert(StudentVO vo);
	
	//�˻�, Read One
	public StudentVO read(int no);
	
	//����, Delete
	public void delete(int no);
	
	//����, Update
	public void update(StudentVO vo);
	
	//���, Read List
	public ArrayList<StudentVO> list();
}
