package sale;

import java.util.Scanner;

public class Example2 {
	public static void execute() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		SaleDAO dao=new SaleDAO();
		SaleVO vo=null;
		while(run) {
			System.out.println("\n**********************�� �� �� �� ****************");
			System.out.println("-----------------------------------------------");
			System.out.println("1.��� | 2.��� | 3.�˻� | 4.���� | 5.���� | 0.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();s.nextLine();
			switch(menu) {
			case 0:
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			case 1://���
				int newNo=dao.getNo() + 100;
				System.out.println("��ǰ��ȣ>" + newNo);
				
				vo=new SaleVO();
				vo.setNo(newNo);
				System.out.print("��ǰ�̸�>");
				vo.setName(s.nextLine());
				System.out.print("��ǰ�ܰ�>");
				vo.setPrice(s.nextInt());s.nextLine();
				System.out.print("�Ǹż���>");
				vo.setQnt(s.nextInt());s.nextLine();
				dao.insert(vo);
				System.out.println("���ο� ��ǰ�� ��ϵǾ����ϴ�.");
				break;
			case 2://���
				for(SaleVO v:dao.list()) {
					System.out.println(v.toString());
				}
				break;
			case 3://�˻�
				System.out.print("�˻��ҹ�ȣ>");
				int sno=s.nextInt();s.nextLine();
				vo=dao.read(sno);
				if(vo.getName()==null) {
					System.out.println("�ش� ��ǰ�� �����ϴ�.");
				}else {
					System.out.println(vo.toString());
				}
				break;
			case 4://����
				System.out.print("�����ҹ�ȣ>");
				int uno=s.nextInt();s.nextLine();
				vo=dao.read(uno);
				if(vo.getName()==null) {
					System.out.println("������ ��ǰ�� �����ϴ�.");
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
					System.out.println(uno + "�� ��ǰ�� �����Ǿ����ϴ�.");
				}
				break;
			case 5://����
				System.out.print("�����ҹ�ȣ>");
				int dno=s.nextInt();s.nextLine();
				vo=dao.read(dno);
				if(vo.getName()==null) {
					System.out.println("������ ��ǰ�� �����ϴ�.");
				}else {
					dao.delete(dno);
					System.out.println(dno + "�� ��ǰ�� �����Ǿ����ϴ�.");
				}
				break;
			default:
				System.out.println("0~5�� �޴��� �����ϼ���.");
			}
		}
	}
}
