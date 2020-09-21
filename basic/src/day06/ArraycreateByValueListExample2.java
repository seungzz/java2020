package day06;

public class ArraycreateByValueListExample2 {
	public static void main(String[] args) {  //void:리턴값이 없다
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 =0;
		for(int i=0; i<3; i++) {
			sum1 +=scores[i];
		}
		System.out.println("총합: " +sum1);
		
		int sum2 = add(new int[] {83,90,87} );
		System.out.println("총합: " +sum2	);	
		System.out.println();
		System.out.println();
		
	}
	public static int add(int[] scores) {   //int로 리턴하겠다 -> 반드시 출력값이 있다. 
		int sum =0;							//위의 int sum을 scores라고 부르겠다는 뜻
		for(int i=0; i<3; i++ ) {
			sum+= scores[i];
		
			}
		return sum;  //위의 for문을 따로 빼서 따로 값을 만들겠다. 
	}
}
