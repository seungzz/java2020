package day38.io.WriteReadObject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable{
	public String field2;
	
	
	//writeObject�� ����ȭ�ҋ� �ڵ����� ����Ǵ� �޼ҵ�
	//writeObject()�� private�� �ٿ���� ����ȭ�� �� �� �ڵ����� ȣ���� �ȴ�.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1);		//�θ� ���� �ʵ带 ������
		out.defaultWriteObject();	//���ǵ� �ʵ���� ��� ����ȭ�ϴ� �޼ҵ�
	}
	
	private void readObject() {
		
	}
	
}
