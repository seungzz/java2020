package MiniProject;

public class Matzip_VO extends Product_VO{
	
		String storeName;
		String storeNum;
		String storeLocation;
		String recommendedMenu;
		int price;
		
	
		
		

		public Matzip_VO(int no, String storeName,String storeNum,String storeLocation, String recommendedMenu,int price) {
			this.no = no;
			this.storeName = storeName;
			this.storeNum = storeNum;
			this.storeLocation = storeLocation;
			this.recommendedMenu = recommendedMenu;
			this.price = price;
		}

		public String getStoreName() {
			return storeName;
		}public void setStoreName(String storeName) {
			this.storeName = storeName;}
		public String getStoreNum() {
			return storeNum;
		}

		public void setStoreNum(String storeNum) {
			this.storeNum = storeNum;
		}

		public String getStoreLocation() {
			return storeLocation;
		}

		public void setStoreLocation(String storeLocation) {
			this.storeLocation = storeLocation;
		}
		
		public String getRecommendedMenu() {
			return recommendedMenu;
		}

		public void setRecommendedMenu(String recommendedMenu) {
			this.recommendedMenu = recommendedMenu;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
			
		}
		
	

