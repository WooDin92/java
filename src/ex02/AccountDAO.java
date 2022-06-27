package ex02;

import java.util.*;

public class AccountDAO {
	
	public void insert(AccountVO vo, ArrayList<AccountVO>array) {
		array.add(vo);
	}
	public void trade(int no,int amount, ArrayList<AccountVO>array) {
		for(AccountVO a:array) {
			if(no==a.getNo()) {
				a.setBalance(a.getBalance()+amount);
				
				
			}
			
			
		}
		
		
	}
	
	public ArrayList<AccountVO> list (){
		ArrayList<AccountVO> array = new ArrayList<>();
	
		AccountVO vo = new AccountVO();
		vo.setNo(100);
		vo.setName("È«±æµ¿");
		vo.setBalance(1000);
		array.add(vo);
		
		vo = new AccountVO();
		vo.setNo(200);
		vo.setName("¹Îº´°ü");
		vo.setBalance(2000);
		array.add(vo);
		
		vo = new AccountVO();
		vo.setNo(300);
		vo.setName("±èµÎÇÑ");
		vo.setBalance(1500);
		array.add(vo);
		
	return array;
	}
	public AccountVO read(int no, ArrayList<AccountVO> array) {
		AccountVO vo = new AccountVO();
		for(AccountVO a:array) {
			if(no==a.getNo()) {
				vo.setNo(a.getNo());
				vo.setName(a.getName());
				vo.setBalance(a.getBalance());

			}
		}
		return vo;
	}
	
	
	
	
	
	

}
