package ex11;

import java.util.Scanner;

import sale.Example2;
import student.Example1;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("\n-----------------------------------------------");
			System.out.println("1.�л����� ���α׷�");
			System.out.println("2.������� ���α׷�");
			System.out.println("0.���α׷� ����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();s.nextLine();
			switch(menu) {
			case 0:
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			case 1:
				Example1.execute();
				break;
			case 2:
				Example2.execute();
				break;
			default:
				System.out.println("0~2 �޴��� �����ϼ���.");
			}
		}
	}

}
