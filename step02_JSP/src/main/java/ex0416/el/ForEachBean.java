package ex0416.el;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachBean {
	private String names [] = {"둘리","짱구","희동이","루피", "뽀로로"};
	
	private List<String> menus = Arrays.asList("짜장", "짬뽕", "탕수육", "팔보채", "짬짜면");
	
	private List<Board> boardList = new ArrayList<Board>();
	
	private Map<String, String> map = new HashMap<String, String>();
	
	public ForEachBean() {
		boardList.add(new Board(10, "제목1","내용1"));
		boardList.add(new Board(20, "제목2","내용2"));
		boardList.add(new Board(30, "제목3","내용3"));
		boardList.add(new Board(40, "제목4","내용4"));
		boardList.add(new Board(50, "제목5","내용5"));
		
		// 각 나라별 국가코드
		map.put("kr", "대한민국");
		map.put("us", "미국");
		map.put("jp", "일본");
		map.put("cn", "중국");
		map.put("fr", "프랑스");
	}

	public String[] getNames() {	// jsp에서 ${변수.names}
		return names;
	}

	public List<String> getMenus() {	// jsp에서 ${변수.menus}
		return menus;
	}

	public List<Board> getBoardList() {		// jsp에서 ${변수.boardList}
		return boardList;
	}

	public Map<String, String> getMap() {		// jsp에서 ${변수.map}
		return map;
	}
}
