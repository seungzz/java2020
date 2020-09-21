package MiniProject;

import java.io.*;
import java.util.*;

public class MatZipService {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Matzip_VO> mz = new ArrayList<Matzip_VO>();
	ArrayList<Member_VO> me	= new ArrayList<Member_VO>();
	int no =1;

	public void wholeInq() {
		System.out.println("1���� �����ϼ̽��ϴ�.");
		for(Matzip_VO p : mz) {
			System.out.println("����: "+p.getNo()+"\t");
			System.out.print("��ȣ��:" + p.getStoreName()+"\t");
			System.out.print("��ġ: "+ p.getStoreLocation()+"\t");
			System.out.print("��ȣ: "+p.getStoreNum()+"\t");
			System.out.print("��õ�޴�: "+p.getRecommendedMenu()+"\t");
			System.out.println("��õ�޴�����"+p.getPrice());
		}
	}
	public void partInq() {
		System.out.println("2���� �����ϼ̽��ϴ�.");
		boolean run = true;
		while(run) {
			System.out.println("�˻��ϰ� ���� ������ �����ϼ���");			
			System.out.println("1.��ȣ��˻�| 2.�����˻�| 3.��ȣ��ȣ�˻�"+ "| 4.�޴��˻�| 5.���ݴ�˻�");
			System.out.println("---------------------------------------------------------");
			System.out.println("����>");
			int selectINo = scanner.nextInt();
		switch(selectINo) {
		case 1:
			System.out.println("1���� �����ϼ̽��ϴ�.");
			System.out.println("��ȣ���� �Է����ּ���!");
			String insertName = scanner.next();
			int count =0;
			String str= null;
			for(Matzip_VO p : mz) {
				if(p.getStoreName().contains(insertName)) {
					str = p.storeLocation +"\t";
					str +=p.storeNum+"\t";
					str +=p.recommendedMenu+"\t";
					str +=p.price;
					count++;
				} 
			}
			System.out.println("�� " +count+"���� �˻��Ǿ����ϴ�." );
			System.out.println(str);
			if(count==0) {
				System.out.println("�ش�Ǵ� �׸��� �����ϴ�.");
			}
			
			
			break;
		case 2:
			System.out.println("2���� �����ϼ̽��ϴ�.");
			System.out.println("�˻��� ������ �Է����ּ���");
			String insertLocation = scanner.next();
			count =0;
			str= null;
			for(Matzip_VO p : mz) {
				if(p.storeLocation.equals(insertLocation)) {
					str = p.storeName +"\t";
					str +=p.storeNum+"\t";
					str +=p.recommendedMenu+"\t";
					str +=p.price;
					count++;
				}
			}
			System.out.println("�� " +count+"���� �˻��Ǿ����ϴ�." );
			System.out.println(str);
			if(count==0) {
				System.out.println("�ش�Ǵ� �׸��� �����ϴ�.");
			}
			break;
		case 3:
			System.out.println("3���� �����ϼ̽��ϴ�.");
			System.out.println("��ȣ��ȣ�� �Է��ϼ���");
			String insertNum = scanner.next();
			count =0;
			str= null;
			for(Matzip_VO p :mz) {
				if(p.storeNum.equals(insertNum)) {
					str = p.storeName +"\t";
					str +=p.storeNum+"\t";
					str +=p.recommendedMenu+"\t";
					str +=p.price;
					count++;
				}System.out.println("�� " +count+"���� �˻��Ǿ����ϴ�." );
				System.out.println(str);
				if(count==0) {
					System.out.println("�ش�Ǵ� �׸��� �����ϴ�.");
				}
			}
			break;
		case 4:
			System.out.println("4���� �����ϼ̽��ϴ�.");
			System.out.println("�޴��� �˻��ϼ���");
			String insertMenu = scanner.next();
			count =0;
			str= null;
			for(Matzip_VO p :mz) {
				if(p.recommendedMenu.equals(insertMenu)) {
					str = p.storeName +"\t";
					str +=p.storeNum+"\t";
					str +=p.storeLocation+"\t";
					str +=p.price;
					count++;
				}System.out.println("�� " +count+"���� �˻��Ǿ����ϴ�." );
				System.out.println(str);
				if(count==0) {
					System.out.println("�ش�Ǵ� �׸��� �����ϴ�.");
				}
			}
			break;
		case 5:
			System.out.println("5���� �����ϼ̽��ϴ�.");
			System.out.println("�ش� ���ݴ븦 �Է��ϼ���");
			System.out.println("1.1���� ����| 2.~1������| 3.~2������| 4.~3������|");
			int insertPrice = scanner.nextInt();
			 if(insertPrice==1) {
				 System.out.println("1.1���� ���� : ");
				 for(Matzip_VO p :mz) {
					 if(p.price<10000) {
						 System.out.println(p.storeName);
							System.out.print(p.storeLocation);
							System.out.print(p.storeNum);
							System.out.println(p.recommendedMenu);

					 }
				 }
			 }else if(insertPrice ==2) {
				 System.out.println("2.~1������ ");
				 for(Matzip_VO p :mz) {
					 if(10000<=p.price && p.price<20000) {
						 System.out.println(p.storeName);
							System.out.print(p.storeLocation);
							System.out.print(p.storeNum);
							System.out.println(p.recommendedMenu);

					 }
				 }
			 }else if(insertPrice ==3) {
				 System.out.println("3.~2������ ");
				 for(Matzip_VO p :mz) {
					 if(20000<=p.price && p.price<30000) {
						 System.out.println(p.storeName);
							System.out.print(p.storeLocation);
							System.out.print(p.storeNum);
							System.out.println(p.recommendedMenu);

					 }
				 }
		}else if(insertPrice ==4) {
			 System.out.println(" 4.~3������ ");
			 for(Matzip_VO p :mz) {
				 if(30000<=p.price && p.price<40000) {
					 System.out.println(p.storeName);
						System.out.print(p.storeLocation);
						System.out.print(p.storeNum);
						System.out.println(p.recommendedMenu);

				 }
			 }
		  }	
			 break;
		}
	  }	
	}
	
	
	public void enroll() {
		System.out.println("3���� �Է��ϼ̽��ϴ�."); 
		System.out.println("");
		System.out.println("���� �̸��� �Է��ϼ���.");
		
		Scanner s = new Scanner(System.in);
		String storeName = s.next();
		System.out.println("���� ��ȣ�� �Է��ϼ���.");
		String storeNum = s.next();
		System.out.println("���� �ּҸ� �Է��ϼ���.");
		String storeLocation = s.next();
		System.out.println("���� ��õ�޴��� �Է��ϼ���.");
		String recommendedMenu = s.next();
		System.out.println("��õ�޴��� ������ �Է��ϼ��� ");
		int price = s.nextInt();
		mz.add(new Matzip_VO(no++, storeName,storeNum,storeLocation, recommendedMenu,price));
		System.out.println("�ԷµǾ����ϴ�.");
	
	
	
	
	}
	public void delete() {
		System.out.println("4���� �����ϼ̽��ϴ�.");	
		System.out.println("������ ��ȣ���� �Է��ϼ���.");
		String deleteStoreName = scanner.nextLine();
		for(int i=0; i<mz.size(); i++) {
			Matzip_VO str = mz.get(i);
			if(str.getStoreName().equals(deleteStoreName)) {
				mz.remove(i);
			}
		}
		System.out.println("�����Ǿ����ϴ�.");
		}
	
	
	public void modify() {
		Scanner mo = new Scanner(System.in);
		System.out.println("5���� �����ϼ̽��ϴ�.");
		System.out.println("������ ������ �����ϼ���.");
		System.out.println("1.��ȣ��| 2.����| 3.��ȣ��ȣ| 4.��õ�޴�| 5.����");
		System.out.println("����>");
		sj : while(true) {
			int modifyNum = scanner.nextInt();
			scanner.nextLine();
			
			switch(modifyNum) {
				case 1:
					System.out.println("��ȣ���� �����ϼ̽��ϴ�.");
					System.out.println("������ ��ȣ���� �Է����ּ���.");
					String modiName = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(modiName.contains(p.storeName)) {
							System.out.println("���ο� ��ȣ���� �Է����ּ���.");
							String newName = mo.nextLine();
							p.storeName = newName;
							break sj;
						}
					}
				case 2:
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("������ ������ �Է����ּ���.");
					String region = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(region.contains(p.storeLocation)) {
							System.out.println("���ο� �������� �Է����ּ���.");
							String newLocation = mo.nextLine();		//mo��� ��ĳ�ʷ� ��ĵ�Ѵ�
							p.storeLocation = newLocation;
							break sj;
						}
					}
				case 3:
					System.out.println("��ȣ��ȣ�� �����ϼ̽��ϴ�.");
					System.out.println("������ ��ȣ�� �Է����ּ���.");
					String num = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(num.contains(p.storeNum)) {
							System.out.println("���ο� ��ȣ�� �Է����ּ���.");
							String newNum = mo.nextLine();
							p.storeNum = newNum;
							break sj;
						}
					}
				case 4:
					System.out.println("��õ�޴��� �����ϼ̽��ϴ�.");
					System.out.println("������ ��õ�޴��� �Է����ּ���.");
					String menu = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(menu.contains(p.recommendedMenu)) {
							System.out.println("���ο� ��õ�޴��� �Է����ּ���.");
							String newMenu = mo.nextLine();
							p.recommendedMenu = newMenu;
							break sj;
						}
					}
				case 5:
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("������ ������ �Է����ּ���.");
					int price = scanner.nextInt();
					scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(price== p.price) {
							System.out.println("���ο� ������ �Է����ּ���.");
							String newNum = mo.nextLine();
							p.storeNum = newNum;
							break sj;
						}
					}
			}
		}
	}
	public void save() throws Exception {
		File file = new File("c:/Temp/hi.txt");
		FileWriter fw = new FileWriter(file);
		for(int i=0; i<mz.size(); i++) {
			Matzip_VO str = mz.get(i);
			fw.write(str.getNo()+",\t"+str.getStoreName()+",\t"+str.storeNum+",\t"+str.storeLocation
					+",\t"+str.recommendedMenu+",\t"+str.getPrice()+"\n");
		}
			System.out.println("������ ����Ǿ����ϴ�.");
			fw.flush();
			fw.close();
	}
	public void read() throws Exception {
		FileReader fr = new FileReader("c:/Temp/hi.txt");
		BufferedReader br = new BufferedReader(fr);
		String lineString;
		
		while((lineString=br.readLine())!=null) {
			
			String text[] = lineString.split(",\t");
			
			mz.add(new Matzip_VO(Integer.parseInt(text[0]),text[1],text[2],text[3],text[4],Integer.parseInt(text[5])));	
		}
		fr.close();
		
	}
	
	public void login() {
		Scanner ms = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		 while(run) {
			 System.out.println("--------------------");
				System.out.println(" 1.ȸ������ | 2.�α���");
				System.out.println("--------------------");
				System.out.println("����>>");
				String loginNum = scanner.nextLine();

		 switch(loginNum) {
		case "1":
			 while(run2) {
				System.out.println("ȸ�������� id�� �Է��ϼ���");
				String id = ms.nextLine();
				
					System.out.println("ȸ�������� p/w�� �Է��ϼ���");
					String pw = ms.nextLine();
					me.add(new Member_VO(id  , pw));
				    System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				    run2 = false;
				}break;
			 
		case "2": 
				System.out.println("�α����� id�� �Է����ּ���.");
				String ID = ms.nextLine();
				System.out.println("pw�� �Է����ּ���.");
				String PW = ms.nextLine();
				for(int i=0; i<me.size(); i++) {
				Member_VO str = me.get(i);
					if(str.getId().equals(ID) && str.getPw().equals(PW)) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						break;
					}else {
						System.out.println("�Է��Ͻ� id or pw�� �ùٸ��� �ʽ��ϴ�.");
						}
				}
				run = false;
				break;
		}
	}

}
}

		
		
		
	
