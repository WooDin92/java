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
		vo.setName("ȫ�浿");
		vo.setGrade(90);
		array.add(vo);
		
		vo = new ScoreVO();
		vo.setNo(200);
		vo.setName("��û��");
		vo.setGrade(95);
		array.add(vo);
		
		vo = new ScoreVO();
		vo.setNo(300);
		vo.setName("�Ѽ���");
		vo.setGrade(100);
		array.add(vo);

		
		while(run) {
			System.out.println("==============================================================");
			System.out.println("1.��� | 2. �˻� | 3.��� | 4.���� | 5.���� |");
			System.out.println("==============================================================");
			System.out.print("�޴� ���� > ");
			int menu = s.nextInt(); s.nextLine();
			switch(menu) {
			case 0 :
				run=false;
				System.out.println(" ���� �մϴ�. ");
				break;
			case 1 :
				System.out.println(" ��ȣ : " + no);
				vo = new ScoreVO();
				vo.setNo(no);
				System.out.print("�̸� > " );
				vo.setName(s.nextLine());
				System.out.print("���� > " );
				vo.setGrade(s.nextInt()); s.nextLine();
				dao.insert(vo, array);
				System.out.println("������ϿϷ�!");
				no+=100;
				break;
				
			case 2 :
				System.out.print("�˻��Ͻ� ��ȣ > ");
				int sno = s.nextInt(); s.nextLine();
				vo=dao.read(sno, array);
				if(vo.getName()==null) {
					System.out.println("��ϵ� ��ȣ�� �����ϴ�.");					
				} else { 
					vo.prin();
				}				
				break; 
				
			case 3 :
				System.out.println("��ü �л� �� " +  array.size());				
				for(ScoreVO v:array) {	
					v.prin();					
				}				
				break;
				
			case 4 :
				System.out.print("�����Ͻ� ��ȣ > ");
				int no1 = s.nextInt(); s.nextLine();
				vo=dao.read(no1, array);
				if(vo.getName()==null) {
					System.out.println("��ϵ� ��ȣ�� �����ϴ�.");
				}else {

					System.out.print(vo.getName() + "> ");
					String newName=s.nextLine();
					System.out.print(vo.getGrade() + "> ");
					String newGrade=s.nextLine();
					if(!newName.equals("")) vo.setName(newName);
					if(!newGrade.equals("")) vo.setGrade(Integer.parseInt(newGrade));
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					dao.update(vo, array);
					
				}
				
				break;
				
			case 5 :
				System.out.print("�����Ͻ� ��ȣ > ");
				int dno = s.nextInt(); s.nextLine();
				vo=dao.read(dno, array);
				if(vo.getName()==null) {
					System.out.println("��ϵ� ��ȣ�� �����ϴ�.");
				}else {
					dao.del(dno, array);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					
				}
				
				break;
				
				default:
					System.out.println("������ �缱�� �ٶ��ϴ�.");
			
			
			
			
			}
		}
	}

}
