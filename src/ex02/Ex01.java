package ex02;

import java.util.*;

public class Ex01 {

		public static void execuute() {
			//학생목록출력
			StudentDAO dao = new StudentDAOimpl();
//			ArrayList<StudentVo> array = dao.list();
//			System.out.println("전체 학생 수 " +  array.size());
//			
//			for(StudentVo vo:array) {
//
//				vo.pint();
//				
//			}
			
			//학생검색
//			StudentVo vo = dao.read(200);
//			vo.pint();
			
			//학생입력
//			StudentVo vo = new StudentVo();
//			vo.setNo(400);
//			vo.setName("갈갈갈");
//			vo.setTel("010-4444-1231");	
//			vo.setJuso("서울 서초구 양재동");
//			dao.insert(vo);
//			
//			vo=dao.read(200);
			
			
			//학생 삭제
			
//			StudentVo d = new StudentVo();
//			dao.delete(100);
//			d.pint();
			
			
			//학생 수정
			
			StudentVo d = new StudentVo();
			d.setNo(100);
			d.setName("김씨");
			d.setTel("010-6666-1237");
			d.setJuso("인천 남구 학인동");
			
			dao.update(d);
			
			
			
			
		}
}
