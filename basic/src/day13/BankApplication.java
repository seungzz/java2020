package day13;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
				
				
				
				
			}else if(selectNo == 2) {
				accountList();
				
				
				
			}else if(selectNo == 3) {
				deposit();
				
				
				
				
			}else if(selectNo == 4) {
				withdraw();
				
				
				
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
	
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.println("계좌번호:");
		String a = scanner.nextLine();
		scanner.nextLine();
		System.out.println("계좌주:");
		String b = scanner.nextLine();
	
		
		System.out.println("초기입금액:");
		int c = scanner.nextInt();
		scanner.nextLine();
		//공백이 일어날때 끊기게 되어있기 때문, 엔터 버퍼를 날려준다.
		
		
		Account newAccount = new Account(a,b,c);
		//accountArray는 account의 배열이기 때문에 객체를 만들어주어야 한다.
		
	for(int i=0; i<accountArray.length; i++) {
	if(accountArray[i] == null	) { //계좌가 비어있는지 아닌지 확인을 하고 계좌번호를 쌓으면 된다.
		//객체를 만들었는데 아무것도 넣지 않았다 -> null이다. int배열->0 , false . 객체만 null!
		accountArray[i] = newAccount;	//배열의 i에 새로만든 계좌를 넣는다. 
		System.out.println("계좌가 생성되었습니다.");
		break;	//하나만 넣고 나서 중지를 시켜주어야 하기 때문이다.
	}
	

	
	}
	}
		
	
		 
			
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
	
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno() +"  "+accountArray[i].getOwner()+ "  "+ accountArray[i].getBalance());
			}
			

	}
	}	
	
	
	//예금하기
	private static void deposit() {//findAccount로 찾아
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");

		System.out.println("계좌번호:");
		String a = scanner.nextLine();
		scanner.nextLine();
		System.out.println("예금:");
		int c = scanner.nextInt();
		scanner.nextLine();
		
		
		
		Account account = findAccount(a);
		if(account == null) {	//계좌번호가 없을때에 걸러지는 장치
			System.out.println("잘못된 계좌번호입니다.");
		}else {
		int sum = account.getBalance()+ c;
		}
		
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");

		System.out.println("계좌번호:");
		String a = scanner.nextLine();
		System.out.println("예금:");
		int c = scanner.nextInt();
		scanner.nextLine();
		Account account = findAccount(a);
		if(account == null) {	//계좌번호가 없을때에 걸러지는 장치
			System.out.println("잘못된 계좌번호입니다.");
		}else {
		int sum = account.getBalance()- c;
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {	//findAccount는 리턴값이 있다 <-Account가 앞에 달려있음
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
			boolean answer = accountArray[i].getAno().equals(ano); //같은 계좌번호를 가졌는지 비교하기 위해 
			if(answer) {
				return accountArray[i];	//0번째부터99번째까지 뒤지면서 찾는다
			}
		}
		}
		return null; //찾는것이 없을때(비교하고 똑같은것이 없을때) = return account;
	}
}
