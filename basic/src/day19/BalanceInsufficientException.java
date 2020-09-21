package day19;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {	//예외를 만들 경우 보통 쓰는 형식
		super(message);
	}
}
