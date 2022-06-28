package sale;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;

public class SaleDAO {
	File file=new File("c:/data/java/ex11/sales.txt");
	
	//����
	public void update(SaleVO vo) {
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			String lines=""; //no�� ������ ��������ǰ���� ����
			while((line=reader.readLine()) != null) {
				StringTokenizer st=new StringTokenizer(line, "|");
				int no = Integer.parseInt(st.nextToken());
				if(no==vo.getNo()) {
					lines=lines + vo.getNo()+"|"+vo.getName()+"|"
								+vo.getPrice()+"|"+vo.getQnt()+"\n";
				}else {
					lines=lines + line + "\n";
				}
			}
			//������ ���Ӱ� ����
			FileWriter writer=new FileWriter(file, false);
			writer.write(lines);
			writer.flush();
			writer.close();
		}catch(Exception e) {
			System.out.println("����:" + e.toString());
		}
	}
	
	//����
	public void delete(int no) {
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			String lines=""; //no�� ������ ��������ǰ���� ����
			while((line=reader.readLine()) != null) {
				SaleVO vo=new SaleVO();
				StringTokenizer st=new StringTokenizer(line, "|");
				vo.setNo(Integer.parseInt(st.nextToken()));
				if(no!=vo.getNo()) {
					lines=lines + line + "\n";
				}
			}
			//������ ���Ӱ� ����
			FileWriter writer=new FileWriter(file, false);
			writer.write(lines);
			writer.flush();
			writer.close();
		}catch(Exception e) {
			System.out.println("����:" + e.toString());
		}
	}
	//�˻�
	public SaleVO read(int no) {
		SaleVO vo=new SaleVO();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine()) != null) {
				StringTokenizer st=new StringTokenizer(line, "|");
				vo.setNo(Integer.parseInt(st.nextToken()));
				if(no==vo.getNo()) {
					vo.setName(st.nextToken());
					vo.setPrice(Integer.parseInt(st.nextToken()));
					vo.setQnt(Integer.parseInt(st.nextToken()));
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("getNo:" + e.toString());
		}
		return vo;
	}
	
	//������ ��ȣ ���������
	public int getNo() {
		int no=0;
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine()) != null) {
				StringTokenizer st=new StringTokenizer(line, "|");
				no=Integer.parseInt(st.nextToken());
			}
		}catch(Exception e) {
			System.out.println("getNo:" + e.toString());
		}
		return no;
	}
	
	//���
	public void insert(SaleVO vo) {
		try {
			FileWriter writer=new FileWriter(file, true);
			writer.write(vo.getNo()+"|");
			writer.write(vo.getName()+"|");
			writer.write(vo.getPrice()+"|");
			writer.write(vo.getQnt()+"\n");
			writer.flush();
			writer.close();
		}catch(Exception e) {
			System.out.println("���:" + e.toString());
		}
	}
	
	//���
	public ArrayList<SaleVO> list(){
		ArrayList<SaleVO> array=new ArrayList<SaleVO>();
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine()) != null) {
				StringTokenizer st=new StringTokenizer(line, "|");
				SaleVO vo=new SaleVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setPrice(Integer.parseInt(st.nextToken()));
				vo.setQnt(Integer.parseInt(st.nextToken()));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("���:" + e.toString());
		}
		return array;
	}
}
