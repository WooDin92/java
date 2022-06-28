package student;

import java.util.*;

public class Example1 {
	public static void execute() {
		Scanner s=new Scanner(System.in);
		StudentDAO dao=new StudentDAOImpl();
		StudentVO vo=null;
	
		boolean run=true;
		while(run) {
			System.out.println("\n**********************학 생 관 리 ****************");
			System.out.println("-----------------------------------------------");
			System.out.println("1.등록 | 2.목록 | 3.검색 | 4.수정 | 5.삭제 | 0.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			int menu=s.nextInt();s.nextLine();
			switch(menu) {
			case 0:
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case 1://등록
				int newCode=dao.getCode() + 100;
				System.out.println("번호>" + newCode);
				vo=new StudentVO();
				vo.setNo(newCode);
				System.out.print("이름>");
				vo.setName(s.nextLine());
				System.out.print("전화>");
				vo.setTel(s.nextLine());
				System.out.print("주소>");
				vo.setAddress(s.nextLine());
				dao.insert(vo);
				System.out.println("새로운 학생이 등록되었습니다.");
				break;
			case 2://목록
				ArrayList<StudentVO> array=dao.list();
				for(StudentVO v:array) {
					System.out.printf("%d\t%s\t%s\t%s\n",
						v.getNo(), v.getName(), v.getTel(), v.getAddress());
				}
				System.out.println("전체데이터갯수:" + array.size());
				break;
			case 3://검색
				System.out.print("검색할번호>");
				int sno=s.nextInt();s.nextLine();
				vo=dao.read(sno);
				if(vo.getName()==null) {
					System.out.println("검색할 학생이 존재하지 않습니다.");
				}else {
					System.out.println(vo.toString());
				}
				break;
			case 4://수정
				System.out.print("수정할번호>");
				int uno=s.nextInt();s.nextLine();
				vo=dao.read(uno);
				String oldName=vo.getName();
				if(vo.getName()==null) {
					System.out.println("수정할 번호가 존재하지 않습니다.");
				}else {//수정할 내용객체
					System.out.print(vo.getName()+">");
					String name=s.nextLine();
					System.out.print(vo.getTel()+">");
					String tel=s.nextLine();
					System.out.print(vo.getAddress()+">");
					String address=s.nextLine();
					if(!name.equals("")) vo.setName(name);
					if(!tel.equals("")) vo.setTel(tel);
					if(!address.equals("")) vo.setAddress(address);
					dao.update(vo);
					System.out.println(oldName + "이(가) 수정되었습니다.");
				}
				break;
			case 5://삭제
				System.out.print("삭제할번호>");
				int dno=s.nextInt();s.nextLine();
				vo=dao.read(dno);
				if(vo.getName()==null) {
					System.out.println("삭제할 학생이 존재하지 않습니다.");
				}else {
					dao.delete(dno);
					System.out.println(vo.getName()+"이(가) 삭제되었습니다.");
				}
				break;
			default:
				System.out.println("0~5번 메뉴를 선택하세요!");
			}
		}//while
	}//execute
}//class
