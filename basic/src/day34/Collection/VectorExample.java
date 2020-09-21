package day34.Collection;


import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
	
	List<Board> list = new Vector<Board>();
	//vertor는 ArrayList와 완전히 동일한 형태의 컬렉션 객체입니다.
	//하지만 동기화된 메소드로 구성되어 있기 때문에 다른 스레드가 사용중이라면
	//또 다른 스레드에서는 사용할 수 없습니다.
	//그렇게 때문에 멀티스레드 환경에서 안전하게 객체를 추가 삭제하기 위해서 사용하는 객체입니다.
	list.add(new Board("제목1","내용1","글쓴이1"));
	list.add(new Board("제목2","내용2","글쓴이2"));
	list.add(new Board("제목3","내용3","글쓴이3"));
	list.add(new Board("제목4","내용4","글쓴이4"));
	list.add(new Board("제목5","내용5","글쓴이5"));

	list.remove(2);
	list.remove(3);

	for(int i=0; i<list.size(); i++) {
		Board board = list.get(i);
		System.out.println(board.subject +"\t"+board.content+"\t"+board.writer);
	}
}
	
}