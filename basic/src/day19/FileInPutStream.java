package day19;

public class FileInPutStream implements AutoCloseable{

	private String file;
	
	public FileInPutStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file+ "�� �ݽ��ϴ�.");
	}
	
	

}
