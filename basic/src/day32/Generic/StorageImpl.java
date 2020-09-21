package day32.Generic;

public class StorageImpl<T> implements Storage<T>{
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);	//capacity�� �迭�� ũ�⸦ ������
		//���׸� T[]�� �迭�� ����� ���
	}
	
	
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	

}
