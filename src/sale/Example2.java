package sale;

import java.util.Scanner;

public class Example2 {
	public static void execute() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		SaleDAO dao=new SaleDAO();
		SaleVO vo=null;
		while(run) {
			System.out.println("\n**********************매 출 관 리 ****************");
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
				int newNo=dao.getNo() + 100;
				System.out.println("상품번호>" + newNo);
				
				vo=new SaleVO();
				vo.setNo(newNo);
				System.out.print("상품이름>");
				vo.setName(s.nextLine());
				System.out.print("상품단가>");
				vo.setPrice(s.nextInt());s.nextLine();
				System.out.print("판매수량>");
				vo.setQnt(s.nextInt());s.nextLine();
				dao.insert(vo);
				System.out.println("새로운 상품이 등록되었습니다.");
				break;
			case 2://목록
				for(SaleVO v:dao.list()) {
					System.out.println(v.toString());
				}
				break;
			case 3://검색
				System.out.print("검색할번호>");
				int sno=s.nextInt();s.nextLine();
				vo=dao.read(sno);
				if(vo.getName()==null) {
					System.out.println("해당 상품이 없습니다.");
				}else {
					System.out.println(vo.toString());
				}
				break;
			case 4://수정
				System.out.print("수정할번호>");
				int uno=s.nextInt();s.nextLine();
				vo=dao.read(uno);
				if(vo.getName()==null) {
					System.out.println("수정할 상품이 없습니다.");
				}else {
					System.out.print(vo.getName()+">");
					String name=s.nextLine();
					if(!name.equals("")) vo.setName(name);
					
					System.out.print(vo.getPrice()+">");
					String price=s.nextLine();
					if(!price.equals("")) vo.setPrice(Integer.parseInt(price));
					
					System.out.print(vo.getQnt() + ">");
					String qnt=s.nextLine();
					if(!qnt.equals("")) vo.setQnt(Integer.parseInt(qnt));
					
					dao.update(vo);
					System.out.println(uno + "번 상품이 수정되었습니다.");
				}
				break;
			case 5://삭제
				System.out.print("삭제할번호>");
				int dno=s.nextInt();s.nextLine();
				vo=dao.read(dno);
				if(vo.getName()==null) {
					System.out.println("삭제할 상품이 없습니다.");
				}else {
					dao.delete(dno);
					System.out.println(dno + "번 상품이 삭제되었습니다.");
				}
				break;
			default:
				System.out.println("0~5번 메뉴를 선택하세요.");
			}
		}
	}
}
