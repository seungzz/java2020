package day32.Generic;

public class StorageImpl<T> implements Storage<T>{
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);	//capacity가 배열의 크기를 정해줌
		//제네릭 T[]를 배열로 만드는 방법
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
