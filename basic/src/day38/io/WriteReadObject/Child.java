package day38.io.WriteReadObject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable{
	public String field2;
	
	
	//writeObject는 직렬화할떄 자동으로 실행되는 메소드
	//writeObject()는 private를 붙여줘야 직렬화를 할 때 자동으로 호출이 된다.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1);		//부모가 가진 필드를 가져옴
		out.defaultWriteObject();	//정의된 필드들을 모두 직렬화하는 메소드
	}
	
	private void readObject() {
		
	}
	
}
