package day13;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.println("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	//���»����ϱ�
	private static void createAccount() {
	
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ:");
		String a = scanner.nextLine();
		scanner.nextLine();
		System.out.println("������:");
		String b = scanner.nextLine();
	
		
		System.out.println("�ʱ��Աݾ�:");
		int c = scanner.nextInt();
		scanner.nextLine();
		//������ �Ͼ�� ����� �Ǿ��ֱ� ����, ���� ���۸� �����ش�.
		
		
		Account newAccount = new Account(a,b,c);
		//accountArray�� account�� �迭�̱� ������ ��ü�� ������־�� �Ѵ�.
		
	for(int i=0; i<accountArray.length; i++) {
	if(accountArray[i] == null	) { //���°� ����ִ��� �ƴ��� Ȯ���� �ϰ� ���¹�ȣ�� ������ �ȴ�.
		//��ü�� ������µ� �ƹ��͵� ���� �ʾҴ� -> null�̴�. int�迭->0 , false . ��ü�� null!
		accountArray[i] = newAccount;	//�迭�� i�� ���θ��� ���¸� �ִ´�. 
		System.out.println("���°� �����Ǿ����ϴ�.");
		break;	//�ϳ��� �ְ� ���� ������ �����־�� �ϱ� �����̴�.
	}
	

	
	}
	}
		
	
		 
			
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("----------");
	
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno() +"  "+accountArray[i].getOwner()+ "  "+ accountArray[i].getBalance());
			}
			

	}
	}	
	
	
	//�����ϱ�
	private static void deposit() {//findAccount�� ã��
		System.out.println("----------");
		System.out.println("����");
		System.out.println("----------");

		System.out.println("���¹�ȣ:");
		String a = scanner.nextLine();
		scanner.nextLine();
		System.out.println("����:");
		int c = scanner.nextInt();
		scanner.nextLine();
		
		
		
		Account account = findAccount(a);
		if(account == null) {	//���¹�ȣ�� �������� �ɷ����� ��ġ
			System.out.println("�߸��� ���¹�ȣ�Դϴ�.");
		}else {
		int sum = account.getBalance()+ c;
		}
		
	}
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("���");
		System.out.println("----------");

		System.out.println("���¹�ȣ:");
		String a = scanner.nextLine();
		System.out.println("����:");
		int c = scanner.nextInt();
		scanner.nextLine();
		Account account = findAccount(a);
		if(account == null) {	//���¹�ȣ�� �������� �ɷ����� ��ġ
			System.out.println("�߸��� ���¹�ȣ�Դϴ�.");
		}else {
		int sum = account.getBalance()- c;
		}
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {	//findAccount�� ���ϰ��� �ִ� <-Account�� �տ� �޷�����
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
			boolean answer = accountArray[i].getAno().equals(ano); //���� ���¹�ȣ�� �������� ���ϱ� ���� 
			if(answer) {
				return accountArray[i];	//0��°����99��°���� �����鼭 ã�´�
			}
		}
		}
		return null; //ã�°��� ������(���ϰ� �Ȱ������� ������) = return account;
	}
}
