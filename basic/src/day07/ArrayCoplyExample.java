package day07;

public class ArrayCoplyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[oldStrArray.length];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//              ����ɹ迭  , ��������ε���, ��������迭,��������ε���, ������ �����Ұ��̳�.. 
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
		
	}

}
