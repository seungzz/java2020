package day31.Generic;

public class Product <T,M> {
	private T kind;		//T�������� ������ ���� ���̴�. 
	private M model;	//m�������� ���� ���� ���̴�.(��ƼŸ����������)
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
