package day32.Generic;

class Worker extends Person{

	Worker(String name) {
		super(name);
	}}

class Student extends Person {

	Student(String name) {
		super(name);
	}}

class HighStudent extends Student{

	HighStudent(String name) {
		super(name);
	}}


public class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
