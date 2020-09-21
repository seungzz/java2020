package day32.Generic;

public class Container<K,V> {
	private K key;
	private V value;
	
	public Container(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void setkey(K key) {this.key = key;}
	public void setValue(V value) {this.value = value;}
	public K getKey() {return key;}
	public V getValue() {return value;}
}	

