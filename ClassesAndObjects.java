package programming.core.java;

class Person
{	
	// Instance variable 9dat or "state"
	String name;
	int age;
	
	// 1. Data - Classes can contain data to represent the state of an object in the form of instance variables 
	// 2. Subroutines - Classes can contain subroutines - A method
}
	
public class ClassesAndObjects {

	public static void main(String[] args) {
		
		//Objects created from the Person class
		Person person1 = new Person();
		person1.name = "Jim";
		person1.age = 36;
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 20;
		
		System.out.println(person1.name + " and " + person2.name + " went for a walk!");
		
		

	}

}
