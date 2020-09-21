package day07;

public class ArrayCoplyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[oldStrArray.length];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//              복사될배열  , 복사시작인덱스, 복사받을배열,복사시작인덱스, 어디까지 복사할것이냐.. 
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
		
	}

}
