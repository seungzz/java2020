package day22;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no +"¹ø °´Ã¼ÀÇfinalize()°¡ ½ÇÇàµÊ");
	}
	
}
