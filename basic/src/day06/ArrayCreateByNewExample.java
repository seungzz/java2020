package day06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];		//���� �������� �ʰ� �迭�� ������ �������־��� ��
		for(int i =0; i<3; i++) {
			System.out.println("arrr["+i+"] :" +arr1[i]);
		}
		arr1[0] =10;
		arr1[1] =20;
		arr1[2] =30;
		for(int i =0; i<3; i++) {		//���� �������� ��
			System.out.println("arr1["+i+"] :" +arr1[i]);
		}
		double[] arr2 = new double[3];		//���� �������� �ʾ��� �� double�� �⺻�� 0.0
		for (int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"] :" +arr2[i]);
		}
		String[] arr3 = new String[3];		//���� �������� �ʾ��� �� �������� ����Ʈ null
		for (int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"] :" +arr3[i]);
	}
		arr3[0] ="1��";
		arr3[1] ="2��";
		arr3[2] ="3��";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] :" +arr3[i]);
		} 
	}

}