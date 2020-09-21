package day33.Ramda;

public class UsingThis {
	public int outterField =10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface4 fi = () ->{
				System.out.println("outterField : "+outterField);
				System.out.println("outterField :" +UsingThis.this.outterField+"\n");
				System.out.println("InnerField : "+innerField);
				System.out.println("InnerField : "+ this.innerField+"\n");
			};
			fi.method();
			
		}
	}
}
