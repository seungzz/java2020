package day19;

public class NullPointException {
	public static void main(String[] args) {
		String data = null;
		//System.out.println(data.toString());
		//예외가 발생한다. null값을 갖는 참조 변수를 사용했기 때문이다.
		
		
		int[] i = new int[100] ;
		for(int j =0; j<= i.length; j++) {
			System.out.println(i[j]);
			//배열 사용시 인덱스 범위 초과 확인 잘해야 한다.
		}
	}
}
