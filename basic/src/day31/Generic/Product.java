package day31.Generic;

public class Product <T,M> {
	private T kind;		//T형식으로 종류를 만들 것이다. 
	private M model;	//m형식으로 모델을 만들 것이다.(멀티타입으로지정)
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	

}
