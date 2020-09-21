package day18.ex;

public class Anonymous {
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달린다.");
		}
	};
	
	
	void method1() {
		Vehicle localVar = new Vehicle() { 
		@Override
		public void run() {
			System.out.println("승용차가 달린다.");
		}
		};
	localVar.run();
	}
		void method2 (Vehicle v) {
			v.run();
			
	}
			
}
