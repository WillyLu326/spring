package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import beans.Address;
import beans.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		Address address = (Address) context.getBean("address");
		
		System.out.println(person);
		System.out.println(address);
	}

}
