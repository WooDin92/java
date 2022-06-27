package ex02;

import java.util.*;

public class Ex03 {		
		public static void execute() {
			Scanner s = new Scanner(System.in);
			boolean run=true;
			AccountVO vo =null;
			AccountDAO dao =new AccountDAO();
			ArrayList<AccountVO> array = dao.list();
			int no=400;
			
			
			
			
			while(run) {
				System.out.println("==============================================================");
				System.out.println("1.생성 | 2. 조회 | 3.입금 | 4.출금 | 5.목룍 |");
				System.out.println("==============================================================");
				System.out.print("메뉴 선택 > ");
				int menu = s.nextInt(); s.nextLine();
				switch(menu) {
				case 0 :
					run=false;
					System.out.println(" 종료 합니다. ");
					break;
					case 1 :
						vo=new AccountVO();
						System.out.println("계좌번호 : " + no);
						vo.setNo(no);
						System.out.print("이름 > ");
						vo.setName(s.nextLine());
						System.out.println("입금하실 금액 > ");
						vo.setBalance(Integer.parseInt(s.nextLine()));
						dao.insert(vo, array);
						System.out.println("계좌가 생성되었습니다.");
						no+=100;
						
						break;
						
					case 2 :
						System.out.print(" 조회 하실 계좌번호 > ");
						String sno=s.nextLine();
						vo=dao.read(Integer.parseInt(sno), array);
						if(vo.getName()==null) {
							System.out.println("등록된 계좌가 없습니다.");
						}else {						
						vo.println();
						}
						
						break;
						
					case 3 :
						System.out.print("조회 하실 계좌번호 > ");
						int tno=s.nextInt();s.nextLine();
						vo=dao.read(tno, array);
						if(vo.getName()==null) {
							System.out.println("해당 계좌가 존재하지 않습니다.");
						}else{
						System.out.print("입금 하실 금액 > ");
						int amount=s.nextInt();s.nextLine();
						dao.trade(tno,amount, array);
						System.out.println("입금이 완료되었습니다.");
						vo=dao.read(tno, array);
						vo.print();
						
						}
						
						
						
						
						break;
						
					case 4 :
						System.out.print("조회 하실 계좌번호 > ");
						int ino=s.nextInt();s.nextLine();
						vo=dao.read(ino, array);
						if(vo.getName()==null) {
							System.out.println("해당 계좌가 존재하지 않습니다.");
						}else{
						System.out.print("출금 하실 금액 > ");
						int amount=s.nextInt();s.nextLine();
						if(vo.getBalance()<amount){
						System.out.println("잔액이 부족합니다.");
						break;
								
						}else {
							
						}
						dao.trade(ino,amount*-1, array);
						System.out.println("출금이 완료되었습니다.");
						vo=dao.read(ino, array);
						vo.print();
						
						}
						
						
//						System.out.print("조회 하실 계좌번호 > ");
//						int ino=s.nextInt();s.nextLine();
//						vo=dao.read(ino, array);
//						if(vo.getName()==null) {
//							System.out.println("해당 계좌가 존재하지 않습니다.");
//						}else{
//						System.out.print("출금 하실 금액 > ");
//						int amount=s.nextInt();s.nextLine();
//						dao.trade(ino,amount*-1, array);
//						System.out.println("출금이 완료되었습니다.");
//						vo=dao.read(ino, array);
//						vo.print();
//						
//						}
						
						
						
						
						
						
						break;
					case 5 :
						
						for(AccountVO v:array) {
							v.print();

						}
						System.out.println("등록된 계좌수 : " + array.size());
						break;
						
					default:
						System.out.println("제뉴를 재선택 바랍니다.");
					}

				}
			}
}