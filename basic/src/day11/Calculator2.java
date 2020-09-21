package day11;

public class Calculator2 {
	
	//정사각형의 넓이를 구하는 메소드 double수치 하나만 드렁왔을때
	//이름을 같은데 여러개의 메소드를 쓸 수 있는것 = 메소드 오버로딩 (다른매개변수) 
	//생성자는 초기값을 입력해주기 위해서 많이 쓴다.
	
	double areaRectangle(double width) {
		return width * width;
	}
	//직사각형의 넓이를 구하는 메소드
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
