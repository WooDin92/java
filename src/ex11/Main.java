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
			System.out.println("1.학생관리 프로그램");
			System.out.println("2.매출관리 프로그램");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			int menu=s.nextInt();s.nextLine();
			switch(menu) {
			case 0:
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case 1:
				Example1.execute();
				break;
			case 2:
				Example2.execute();
				break;
			default:
				System.out.println("0~2 메뉴를 선택하세요.");
			}
		}
	}

}
