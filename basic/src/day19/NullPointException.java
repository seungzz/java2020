package day19;

public class NullPointException {
	public static void main(String[] args) {
		String data = null;
		//System.out.println(data.toString());
		//���ܰ� �߻��Ѵ�. null���� ���� ���� ������ ����߱� �����̴�.
		
		
		int[] i = new int[100] ;
		for(int j =0; j<= i.length; j++) {
			System.out.println(i[j]);
			//�迭 ���� �ε��� ���� �ʰ� Ȯ�� ���ؾ� �Ѵ�.
		}
	}
}
