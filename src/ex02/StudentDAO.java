package ex02;

import java.util.*;

//value object �����Ͱ��� �����ϴ� ��ü
public interface StudentDAO {
	//���
	public ArrayList<StudentVo> list();
	//�˻�
	public StudentVo read(int no);
	//�Է�
	public void insert(StudentVo vo);
	//����
	public void delete(int no);
	//����
	public void update(StudentVo vo);
	
	
	
	

}
