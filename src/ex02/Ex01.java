package ex02;

import java.util.*;

public class Ex01 {

		public static void execuute() {
			//�л�������
			StudentDAO dao = new StudentDAOimpl();
//			ArrayList<StudentVo> array = dao.list();
//			System.out.println("��ü �л� �� " +  array.size());
//			
//			for(StudentVo vo:array) {
//
//				vo.pint();
//				
//			}
			
			//�л��˻�
//			StudentVo vo = dao.read(200);
//			vo.pint();
			
			//�л��Է�
//			StudentVo vo = new StudentVo();
//			vo.setNo(400);
//			vo.setName("������");
//			vo.setTel("010-4444-1231");	
//			vo.setJuso("���� ���ʱ� ���絿");
//			dao.insert(vo);
//			
//			vo=dao.read(200);
			
			
			//�л� ����
			
//			StudentVo d = new StudentVo();
//			dao.delete(100);
//			d.pint();
			
			
			//�л� ����
			
			StudentVo d = new StudentVo();
			d.setNo(100);
			d.setName("�达");
			d.setTel("010-6666-1237");
			d.setJuso("��õ ���� ���ε�");
			
			dao.update(d);
			
			
			
			
		}
}
