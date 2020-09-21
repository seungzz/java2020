package day06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];		//값을 지정하지 않고 배열의 갯수만 지정해주었을 때
		for(int i =0; i<3; i++) {
			System.out.println("arrr["+i+"] :" +arr1[i]);
		}
		arr1[0] =10;
		arr1[1] =20;
		arr1[2] =30;
		for(int i =0; i<3; i++) {		//값을 지정했을 때
			System.out.println("arr1["+i+"] :" +arr1[i]);
		}
		double[] arr2 = new double[3];		//값을 지정하지 않았을 때 double의 기본형 0.0
		for (int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"] :" +arr2[i]);
		}
		String[] arr3 = new String[3];		//값을 지정하지 않았을 때 참조값의 디폴트 null
		for (int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"] :" +arr3[i]);
	}
		arr3[0] ="1월";
		arr3[1] ="2월";
		arr3[2] ="3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] :" +arr3[i]);
		} 
	}

}
