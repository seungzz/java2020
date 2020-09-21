package day04;

public class BitShiftExample {
	public static void main(String[] args) {
		System.out.println("1<<3 =" + (1<<3));	//두칸민다
		System.out.println("-8>>3=" +(-8>>3));	//두칸민다, 나머지는 1로 채워줌
		System.out.println("-8 >>>3= "+(-8>>>3)); //<<을 뒤집은 것임 세칸을 옮기고 나머지를 0으로 채우는것 
	}

}
