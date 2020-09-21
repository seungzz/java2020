package MiniProject;

import java.io.*;
import java.util.*;

public class MatZipService {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Matzip_VO> mz = new ArrayList<Matzip_VO>();
	ArrayList<Member_VO> me	= new ArrayList<Member_VO>();
	int no =1;

	public void wholeInq() {
		System.out.println("1번을 선택하셨습니다.");
		for(Matzip_VO p : mz) {
			System.out.println("순번: "+p.getNo()+"\t");
			System.out.print("상호명:" + p.getStoreName()+"\t");
			System.out.print("위치: "+ p.getStoreLocation()+"\t");
			System.out.print("번호: "+p.getStoreNum()+"\t");
			System.out.print("추천메뉴: "+p.getRecommendedMenu()+"\t");
			System.out.println("추천메뉴가격"+p.getPrice());
		}
	}
	public void partInq() {
		System.out.println("2번을 선택하셨습니다.");
		boolean run = true;
		while(run) {
			System.out.println("검색하고 싶은 내용을 선택하세요");			
			System.out.println("1.상호명검색| 2.지역검색| 3.상호번호검색"+ "| 4.메뉴검색| 5.가격대검색");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택>");
			int selectINo = scanner.nextInt();
		switch(selectINo) {
		case 1:
			System.out.println("1번을 선택하셨습니다.");
			System.out.println("상호명을 입력해주세요!");
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
			System.out.println("총 " +count+"건이 검색되었습니다." );
			System.out.println(str);
			if(count==0) {
				System.out.println("해당되는 항목이 없습니다.");
			}
			
			
			break;
		case 2:
			System.out.println("2번을 선택하셨습니다.");
			System.out.println("검색할 지역을 입력해주세요");
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
			System.out.println("총 " +count+"건이 검색되었습니다." );
			System.out.println(str);
			if(count==0) {
				System.out.println("해당되는 항목이 없습니다.");
			}
			break;
		case 3:
			System.out.println("3번을 선택하셨습니다.");
			System.out.println("상호번호를 입력하세요");
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
				}System.out.println("총 " +count+"건이 검색되었습니다." );
				System.out.println(str);
				if(count==0) {
					System.out.println("해당되는 항목이 없습니다.");
				}
			}
			break;
		case 4:
			System.out.println("4번을 선택하셨습니다.");
			System.out.println("메뉴를 검색하세요");
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
				}System.out.println("총 " +count+"건이 검색되었습니다." );
				System.out.println(str);
				if(count==0) {
					System.out.println("해당되는 항목이 없습니다.");
				}
			}
			break;
		case 5:
			System.out.println("5번을 선택하셨습니다.");
			System.out.println("해당 가격대를 입력하세요");
			System.out.println("1.1만원 이하| 2.~1만원대| 3.~2만원대| 4.~3만원대|");
			int insertPrice = scanner.nextInt();
			 if(insertPrice==1) {
				 System.out.println("1.1만원 이하 : ");
				 for(Matzip_VO p :mz) {
					 if(p.price<10000) {
						 System.out.println(p.storeName);
							System.out.print(p.storeLocation);
							System.out.print(p.storeNum);
							System.out.println(p.recommendedMenu);

					 }
				 }
			 }else if(insertPrice ==2) {
				 System.out.println("2.~1만원대 ");
				 for(Matzip_VO p :mz) {
					 if(10000<=p.price && p.price<20000) {
						 System.out.println(p.storeName);
							System.out.print(p.storeLocation);
							System.out.print(p.storeNum);
							System.out.println(p.recommendedMenu);

					 }
				 }
			 }else if(insertPrice ==3) {
				 System.out.println("3.~2만원대 ");
				 for(Matzip_VO p :mz) {
					 if(20000<=p.price && p.price<30000) {
						 System.out.println(p.storeName);
							System.out.print(p.storeLocation);
							System.out.print(p.storeNum);
							System.out.println(p.recommendedMenu);

					 }
				 }
		}else if(insertPrice ==4) {
			 System.out.println(" 4.~3만원대 ");
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
		System.out.println("3번을 입력하셨습니다."); 
		System.out.println("");
		System.out.println("맛집 이름을 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		String storeName = s.next();
		System.out.println("맛집 번호를 입력하세요.");
		String storeNum = s.next();
		System.out.println("맛집 주소를 입력하세요.");
		String storeLocation = s.next();
		System.out.println("맛집 추천메뉴를 입력하세요.");
		String recommendedMenu = s.next();
		System.out.println("추천메뉴의 가격을 입력하세요 ");
		int price = s.nextInt();
		mz.add(new Matzip_VO(no++, storeName,storeNum,storeLocation, recommendedMenu,price));
		System.out.println("입력되었습니다.");
	
	
	
	
	}
	public void delete() {
		System.out.println("4번을 선택하셨습니다.");	
		System.out.println("삭제할 상호명을 입력하세요.");
		String deleteStoreName = scanner.nextLine();
		for(int i=0; i<mz.size(); i++) {
			Matzip_VO str = mz.get(i);
			if(str.getStoreName().equals(deleteStoreName)) {
				mz.remove(i);
			}
		}
		System.out.println("삭제되었습니다.");
		}
	
	
	public void modify() {
		Scanner mo = new Scanner(System.in);
		System.out.println("5번을 선택하셨습니다.");
		System.out.println("수정할 내용을 선택하세요.");
		System.out.println("1.상호명| 2.지역| 3.상호번호| 4.추천메뉴| 5.가격");
		System.out.println("선택>");
		sj : while(true) {
			int modifyNum = scanner.nextInt();
			scanner.nextLine();
			
			switch(modifyNum) {
				case 1:
					System.out.println("상호명을 선택하셨습니다.");
					System.out.println("수정할 상호명을 입력해주세요.");
					String modiName = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(modiName.contains(p.storeName)) {
							System.out.println("새로운 상호명을 입력해주세요.");
							String newName = mo.nextLine();
							p.storeName = newName;
							break sj;
						}
					}
				case 2:
					System.out.println("지역을 선택하셨습니다.");
					System.out.println("수정할 지역을 입력해주세요.");
					String region = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(region.contains(p.storeLocation)) {
							System.out.println("새로운 지역명을 입력해주세요.");
							String newLocation = mo.nextLine();		//mo라는 스캐너로 스캔한다
							p.storeLocation = newLocation;
							break sj;
						}
					}
				case 3:
					System.out.println("상호번호를 선택하셨습니다.");
					System.out.println("수정할 번호를 입력해주세요.");
					String num = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(num.contains(p.storeNum)) {
							System.out.println("새로운 번호를 입력해주세요.");
							String newNum = mo.nextLine();
							p.storeNum = newNum;
							break sj;
						}
					}
				case 4:
					System.out.println("추천메뉴를 선택하셨습니다.");
					System.out.println("수정할 추천메뉴를 입력해주세요.");
					String menu = scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(menu.contains(p.recommendedMenu)) {
							System.out.println("새로운 추천메뉴를 입력해주세요.");
							String newMenu = mo.nextLine();
							p.recommendedMenu = newMenu;
							break sj;
						}
					}
				case 5:
					System.out.println("가격을 선택하셨습니다.");
					System.out.println("수정할 가격을 입력해주세요.");
					int price = scanner.nextInt();
					scanner.nextLine();
					for(Matzip_VO p : mz) {
						if(price== p.price) {
							System.out.println("새로운 가격을 입력해주세요.");
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
			System.out.println("파일이 저장되었습니다.");
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
				System.out.println(" 1.회원가입 | 2.로그인");
				System.out.println("--------------------");
				System.out.println("선택>>");
				String loginNum = scanner.nextLine();

		 switch(loginNum) {
		case "1":
			 while(run2) {
				System.out.println("회원가입할 id를 입력하세요");
				String id = ms.nextLine();
				
					System.out.println("회원가입할 p/w를 입력하세요");
					String pw = ms.nextLine();
					me.add(new Member_VO(id  , pw));
				    System.out.println("등록이 완료되었습니다.");
				    run2 = false;
				}break;
			 
		case "2": 
				System.out.println("로그인할 id를 입력해주세요.");
				String ID = ms.nextLine();
				System.out.println("pw를 입력해주세요.");
				String PW = ms.nextLine();
				for(int i=0; i<me.size(); i++) {
				Member_VO str = me.get(i);
					if(str.getId().equals(ID) && str.getPw().equals(PW)) {
						System.out.println("로그인 되었습니다.");
						break;
					}else {
						System.out.println("입력하신 id or pw가 올바르지 않습니다.");
						}
				}
				run = false;
				break;
		}
	}

}
}

		
		
		
	
