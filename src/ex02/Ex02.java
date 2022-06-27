package ex02;

import java.util.*;

public class Ex02 {
	public static void execute() {
		Scanner s = new Scanner(System.in);
		boolean run=true;
		ScoreDAO dao = new ScoreDAOImpl();
		int no = 400;
		ScoreVO vo = new ScoreVO();
		ArrayList<ScoreVO>  array = dao.list();
		
		vo.setNo(100);
		vo.setName("홍길동");
		vo.setGrade(90);
		array.add(vo);
		
		vo = new ScoreVO();
		vo.setNo(200);
		vo.setName("심청이");
		vo.setGrade(95);
		array.add(vo);
		
		vo = new ScoreVO();
		vo.setNo(300);
		vo.setName("한석봉");
		vo.setGrade(100);
		array.add(vo);

		
		while(run) {
			System.out.println("==============================================================");
			System.out.println("1.등록 | 2. 검색 | 3.목록 | 4.수정 | 5.삭제 |");
			System.out.println("==============================================================");
			System.out.print("메뉴 선택 > ");
			int menu = s.nextInt(); s.nextLine();
			switch(menu) {
			case 0 :
				run=false;
				System.out.println(" 종료 합니다. ");
				break;
			case 1 :
				System.out.println(" 번호 : " + no);
				vo = new ScoreVO();
				vo.setNo(no);
				System.out.print("이름 > " );
				vo.setName(s.nextLine());
				System.out.print("점수 > " );
				vo.setGrade(s.nextInt()); s.nextLine();
				dao.insert(vo, array);
				System.out.println("성적등록완료!");
				no+=100;
				break;
				
			case 2 :
				System.out.print("검색하실 번호 > ");
				int sno = s.nextInt(); s.nextLine();
				vo=dao.read(sno, array);
				if(vo.getName()==null) {
					System.out.println("등록된 번호가 없습니다.");					
				} else { 
					vo.prin();
				}				
				break; 
				
			case 3 :
				System.out.println("전체 학생 수 " +  array.size());				
				for(ScoreVO v:array) {	
					v.prin();					
				}				
				break;
				
			case 4 :
				System.out.print("수정하실 번호 > ");
				int no1 = s.nextInt(); s.nextLine();
				vo=dao.read(no1, array);
				if(vo.getName()==null) {
					System.out.println("등록된 번호가 없습니다.");
				}else {

					System.out.print(vo.getName() + "> ");
					String newName=s.nextLine();
					System.out.print(vo.getGrade() + "> ");
					String newGrade=s.nextLine();
					if(!newName.equals("")) vo.setName(newName);
					if(!newGrade.equals("")) vo.setGrade(Integer.parseInt(newGrade));
					System.out.println("수정이 완료되었습니다.");
					dao.update(vo, array);
					
				}
				
				break;
				
			case 5 :
				System.out.print("삭제하실 번호 > ");
				int dno = s.nextInt(); s.nextLine();
				vo=dao.read(dno, array);
				if(vo.getName()==null) {
					System.out.println("등록된 번호가 없습니다.");
				}else {
					dao.del(dno, array);
					System.out.println("삭제가 완료되었습니다.");
					
				}
				
				break;
				
				default:
					System.out.println("제뉴를 재선택 바랍니다.");
			
			
			
			
			}
		}
	}

}
