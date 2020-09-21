package MiniProject;

import java.util.*;

public class MiniProjectExample {
	private static Scanner scanner = new Scanner(System.in);
	ArrayList<Matzip_VO> mz = new ArrayList<Matzip_VO>();
	ArrayList<Member_VO> me	= new ArrayList<Member_VO>();

	public static void main(String[] args) {
		MatZipService matzip = new MatZipService();
		matzip.login();
		boolean run = true;
		while(run) {
			System.out.println("-------------------���� ������?------------------------------------");
			System.out.println("1.��ü��ȸ| 2.�κ���ȸ| 3.�������| 4.��������| 5.��������| 6.��������| "+
			"7.�����Ϻҷ�����| 8.����  |0.ùȭ��");
			System.out.println("----------------------------------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				matzip.wholeInq();
			}else if(selectNo==2) {
				matzip.partInq();
			}else if(selectNo==3) {
				matzip.enroll();
			}else if(selectNo ==4) {
				matzip.delete();
			}else if(selectNo ==5) {
				matzip.modify();
				}else if(selectNo ==6) {
					try {
						matzip.save();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else if(selectNo ==7)	{
					try {
						matzip.read();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else if(selectNo ==0) {
					matzip.login();
				}else if(selectNo ==8) {
					run = false;
				}
		}
		System.out.println("����Ǿ����ϴ�.");
		}
}
