package student;

import java.util.*;

public class Example1 {
	public static void execute() {
		Scanner s=new Scanner(System.in);
		StudentDAO dao=new StudentDAOImpl();
		StudentVO vo=null;
	
		boolean run=true;
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
				int newCode=dao.getCode() + 100;
				System.out.println("��ȣ>" + newCode);
				vo=new StudentVO();
				vo.setNo(newCode);
				System.out.print("�̸�>");
				vo.setName(s.nextLine());
				System.out.print("��ȭ>");
				vo.setTel(s.nextLine());
				System.out.print("�ּ�>");
				vo.setAddress(s.nextLine());
				dao.insert(vo);
				System.out.println("���ο� �л��� ��ϵǾ����ϴ�.");
				break;
			case 2://���
				ArrayList<StudentVO> array=dao.list();
				for(StudentVO v:array) {
					System.out.printf("%d\t%s\t%s\t%s\n",
						v.getNo(), v.getName(), v.getTel(), v.getAddress());
				}
				System.out.println("��ü�����Ͱ���:" + array.size());
				break;
			case 3://�˻�
				System.out.print("�˻��ҹ�ȣ>");
				int sno=s.nextInt();s.nextLine();
				vo=dao.read(sno);
				if(vo.getName()==null) {
					System.out.println("�˻��� �л��� �������� �ʽ��ϴ�.");
				}else {
					System.out.println(vo.toString());
				}
				break;
			case 4://����
				System.out.print("�����ҹ�ȣ>");
				int uno=s.nextInt();s.nextLine();
				vo=dao.read(uno);
				String oldName=vo.getName();
				if(vo.getName()==null) {
					System.out.println("������ ��ȣ�� �������� �ʽ��ϴ�.");
				}else {//������ ���밴ü
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
					System.out.println(oldName + "��(��) �����Ǿ����ϴ�.");
				}
				break;
			case 5://����
				System.out.print("�����ҹ�ȣ>");
				int dno=s.nextInt();s.nextLine();
				vo=dao.read(dno);
				if(vo.getName()==null) {
					System.out.println("������ �л��� �������� �ʽ��ϴ�.");
				}else {
					dao.delete(dno);
					System.out.println(vo.getName()+"��(��) �����Ǿ����ϴ�.");
				}
				break;
			default:
				System.out.println("0~5�� �޴��� �����ϼ���!");
			}
		}//while
	}//execute
}//class
