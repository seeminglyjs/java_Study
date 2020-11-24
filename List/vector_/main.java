package List.vector_;

import java.util.List;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1","내영1", "끌쓴이1"));
		list.add(new Board("제목2","내영2", "끌쓴이2"));
		list.add(new Board("제목3","내영3", "끌쓴이3"));
		list.add(new Board("제목4","내영4", "끌쓴이4"));
		list.add(new Board("제목5","내영5", "끌쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + " " + board.content + " " + board.writer);
		}
	}

}
