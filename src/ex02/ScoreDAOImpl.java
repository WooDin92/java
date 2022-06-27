package ex02;

import java.util.ArrayList;

public class ScoreDAOImpl implements ScoreDAO{

	

	public ArrayList<ScoreVO> list() {
		ArrayList<ScoreVO> array = new ArrayList<>();
		
		
		
		return array;
	
	}




	@Override
	public void insert(ScoreVO vo, ArrayList<ScoreVO> array) {
		array.add(vo);
		
	}



	@Override
	public void del(int no, ArrayList<ScoreVO> array) {
		for(ScoreVO v:array) {
			
			if (no==v.getNo()) {
				array.remove(v);
				break;
				
				
			}
			
		}
		
		
		
				
	}



	@Override
	public ScoreVO read(int no, ArrayList<ScoreVO> array) {
		ScoreVO vo = new ScoreVO();
		for(ScoreVO v:array) {			
				if (no==v.getNo()) {
					vo.setNo(no);
					vo.setName(v.getName());
					vo.setGrade(v.getGrade());
					
					
				}
		}
					
					
		
		return vo;
	}



	@Override
	public void update(ScoreVO vo, ArrayList<ScoreVO> array) {
		for(ScoreVO v:array) {			
			if(v.getNo()==vo.getNo()) {
				v.setName(vo.getName());
				v.setGrade(vo.getGrade());
			}
		}
	}
}


	



