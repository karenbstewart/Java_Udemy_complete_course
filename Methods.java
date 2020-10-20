package programming.core.java;

class PersonHere
{	
	// Instance variable 9dat or "state"
	String name;
	int age;
	
	// 1. Data - Classes can contain data to represent the state of an object in the form of instance variables 
	// 2. Subroutines (methods) - Classes can contain subroutines - A method
	
	void speak() 
	{
		for(int i=0; i<1; i++) {
			System.out.println("Hello, my name is " + name + " and I am " + age + " years old!");
		}		
	}
	void sayHello(String x, String y) 
	{
		System.out.println(" hello there " + x + " I'm " + y + " would you like to go for a walk? ");
	}
	
}

public class Methods {

	public static void main(String[] args) {
		
		//Objects created from the Person class
		PersonHere person1 = new PersonHere();
		person1.name = "Jim";
		person1.age = 36;
		person1.speak();
		
		PersonHere person2 = new PersonHere();
		person2.name = "Sarah";
		person2.age = 20;
		person2.speak();
		person2.sayHello(person1.name, person2.name);
		
		System.out.println(person1.name + " and " + person2.name + " went for a walk!");
		
		


	}

}
