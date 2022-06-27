package ex02;
import java.util.*;
public interface ScoreDAO {
	public ArrayList<ScoreVO> list ();
	
	public void insert (ScoreVO vo, ArrayList<ScoreVO> array) ;
	
	public ScoreVO read(int no, ArrayList<ScoreVO> array);
	
	public void update (ScoreVO vo, ArrayList<ScoreVO> array);
	
	public void del(int no, ArrayList<ScoreVO> array);
	
	
	
	
}
