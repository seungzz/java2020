package day19;

public class TryWithResouceExample {
	public static void main(String[] args) {
		try (FileInPutStream fis = new FileInPutStream("file.txt")) {
			fis.read();
			throw new Exception();
		}catch(Exception e) {
			System.out.println("抗寇贸府内靛角青");
		}
	}
}
