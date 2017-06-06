package beans;

public class Person {
	
	private int id;
	
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Hi, I'm a person");
	}
}
