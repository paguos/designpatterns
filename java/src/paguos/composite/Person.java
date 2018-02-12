package paguos.composite;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private String title;
	private int age;
	
	private List<Person> children;

	public Person(String name, String title, int age) {
		this.name = name;
		this.title = title;
		this.age = age;
		
		children = new ArrayList();
	}

	public Person(String name, int age) {
		this(name,"", age);
	}
	
	public void add(Person...persons){
		for(Person p : persons)
			children.add(p);
	}
	
	public void remove(Person p){
		children.remove(p);
	}

	public List<Person> getChildren() {
		return children;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", title=" + title + ", age=" + age + "]";
	}

}
