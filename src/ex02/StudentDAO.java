package ex02;

import java.util.*;

//value object 데이터값을 저장하는 객체
public interface StudentDAO {
	//목록
	public ArrayList<StudentVo> list();
	//검색
	public StudentVo read(int no);
	//입력
	public void insert(StudentVo vo);
	//삭제
	public void delete(int no);
	//수정
	public void update(StudentVo vo);
	
	
	
	

}
