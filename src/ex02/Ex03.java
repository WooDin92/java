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
				System.out.println("1.���� | 2. ��ȸ | 3.�Ա� | 4.��� | 5.�� |");
				System.out.println("==============================================================");
				System.out.print("�޴� ���� > ");
				int menu = s.nextInt(); s.nextLine();
				switch(menu) {
				case 0 :
					run=false;
					System.out.println(" ���� �մϴ�. ");
					break;
					case 1 :
						vo=new AccountVO();
						System.out.println("���¹�ȣ : " + no);
						vo.setNo(no);
						System.out.print("�̸� > ");
						vo.setName(s.nextLine());
						System.out.println("�Ա��Ͻ� �ݾ� > ");
						vo.setBalance(Integer.parseInt(s.nextLine()));
						dao.insert(vo, array);
						System.out.println("���°� �����Ǿ����ϴ�.");
						no+=100;
						
						break;
						
					case 2 :
						System.out.print(" ��ȸ �Ͻ� ���¹�ȣ > ");
						String sno=s.nextLine();
						vo=dao.read(Integer.parseInt(sno), array);
						if(vo.getName()==null) {
							System.out.println("��ϵ� ���°� �����ϴ�.");
						}else {						
						vo.println();
						}
						
						break;
						
					case 3 :
						System.out.print("��ȸ �Ͻ� ���¹�ȣ > ");
						int tno=s.nextInt();s.nextLine();
						vo=dao.read(tno, array);
						if(vo.getName()==null) {
							System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
						}else{
						System.out.print("�Ա� �Ͻ� �ݾ� > ");
						int amount=s.nextInt();s.nextLine();
						dao.trade(tno,amount, array);
						System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
						vo=dao.read(tno, array);
						vo.print();
						
						}
						
						
						
						
						break;
						
					case 4 :
						System.out.print("��ȸ �Ͻ� ���¹�ȣ > ");
						int ino=s.nextInt();s.nextLine();
						vo=dao.read(ino, array);
						if(vo.getName()==null) {
							System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
						}else{
						System.out.print("��� �Ͻ� �ݾ� > ");
						int amount=s.nextInt();s.nextLine();
						if(vo.getBalance()<amount){
						System.out.println("�ܾ��� �����մϴ�.");
						break;
								
						}else {
							
						}
						dao.trade(ino,amount*-1, array);
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
						vo=dao.read(ino, array);
						vo.print();
						
						}
						
						
//						System.out.print("��ȸ �Ͻ� ���¹�ȣ > ");
//						int ino=s.nextInt();s.nextLine();
//						vo=dao.read(ino, array);
//						if(vo.getName()==null) {
//							System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
//						}else{
//						System.out.print("��� �Ͻ� �ݾ� > ");
//						int amount=s.nextInt();s.nextLine();
//						dao.trade(ino,amount*-1, array);
//						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
//						vo=dao.read(ino, array);
//						vo.print();
//						
//						}
						
						
						
						
						
						
						break;
					case 5 :
						
						for(AccountVO v:array) {
							v.print();

						}
						System.out.println("��ϵ� ���¼� : " + array.size());
						break;
						
					default:
						System.out.println("������ �缱�� �ٶ��ϴ�.");
					}

				}
			}
}