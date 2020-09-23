package MiniProject;

public class Matzip_VO extends Product_VO{
		private String storeName;
		private String storeNum;
		private String storeLocation;
		private	String recommendedMenu;
		private int price;
		
	
		
		

		public Matzip_VO(int no, String storeName,String storeNum,String storeLocation, String recommendedMenu,int price) {
			
			super.setNo(no);
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
		String getStoreNum() {
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
		
	

