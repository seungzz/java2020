package day34.Collection;


import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
	
	List<Board> list = new Vector<Board>();
	//vertor�� ArrayList�� ������ ������ ������ �÷��� ��ü�Դϴ�.
	//������ ����ȭ�� �޼ҵ�� �����Ǿ� �ֱ� ������ �ٸ� �����尡 ������̶��
	//�� �ٸ� �����忡���� ����� �� �����ϴ�.
	//�׷��� ������ ��Ƽ������ ȯ�濡�� �����ϰ� ��ü�� �߰� �����ϱ� ���ؼ� ����ϴ� ��ü�Դϴ�.
	list.add(new Board("����1","����1","�۾���1"));
	list.add(new Board("����2","����2","�۾���2"));
	list.add(new Board("����3","����3","�۾���3"));
	list.add(new Board("����4","����4","�۾���4"));
	list.add(new Board("����5","����5","�۾���5"));

	list.remove(2);
	list.remove(3);

	for(int i=0; i<list.size(); i++) {
		Board board = list.get(i);
		System.out.println(board.subject +"\t"+board.content+"\t"+board.writer);
	}
}
	
}