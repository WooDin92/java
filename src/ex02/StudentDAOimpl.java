package ex02;

import java.util.ArrayList;

public class StudentDAOimpl implements StudentDAO {


	
		StudentVo vo = new StudentVo();
		
		ArrayList<StudentVo> array = new ArrayList();
		public ArrayList<StudentVo> list() {

		vo.setNo(100);
		vo.setName("ȫ�浿");
		vo.setTel("010-1111-1234");
		vo.setJuso("��õ ���� �漭��");
		array.add(vo);
		
		vo = new StudentVo();
		vo.setNo(200);
		vo.setName("�κ���");
		vo.setTel("010-2222-1234");
		vo.setJuso("��õ ������ ������");
		array.add(vo);
		
		vo = new StudentVo();
		vo.setNo(300);
		vo.setName("�̼���");
		vo.setTel("010-3333-1234");
		vo.setJuso("��õ ��걸 ��絿");
		array.add(vo);
		
		
		return array;
	}

	@Override
	public StudentVo read(int no) {
		

		ArrayList<StudentVo> array = list();
		

		StudentVo vo = new StudentVo();
		for(StudentVo v:array) {
			if(no==v.getNo()) {
				
				vo.setNo(no);
				vo.setName(v.getName());
				vo.setTel(v.getTel());
				vo.setJuso(v.getJuso());
				
				
			}
			
			
		}

		
		return vo;
		}

	@Override
	public void insert(StudentVo vo) {
		ArrayList<StudentVo> array = list();
		array.add(vo);
		for(StudentVo v:array) {
			v.pint();
			
		}
		
	}

	@Override
	public void delete(int no) {
		ArrayList<StudentVo> array = list();
		
		for(StudentVo v:array) {
			if(no==v.getNo()) {
				array.remove(v);
				break;

						
					}
				}
				for(StudentVo v:array) {
					v.pint();


			
			
		}
		
	}

	@Override
	public void update(StudentVo vo) {
		ArrayList<StudentVo> array = list();
		
		for(StudentVo v:array) {
			if(vo.getNo()==v.getNo()) {
				v.setNo(vo.getNo());
				v.setName(vo.getName());
				v.setTel(vo.getTel());
				v.setJuso(vo.getJuso());

				break;

						
					}
				}
		for(StudentVo v:array) {
			v.pint();
		}
		
		
	}
	
	
	

}
