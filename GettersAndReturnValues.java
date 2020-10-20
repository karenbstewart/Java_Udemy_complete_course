package programming.core.java;

class PersonExample
{
	String name;
	int age;
	
	void speak() 
	{
		System.out.println("Hello, my name is : " + name);
	}
	
	int calculateYearsToRetirement() 
	{
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	int getAge() {
		 return age;
	}
	String getName() 
	{
		return name;
	}
}

public class GettersAndReturnValues {

	public static void main(String[] args) {
		PersonExample person1 = new PersonExample();

		person1.name = "Joe";
		person1.age = 25;
		
		//person1.speak();
		
		int years = person1.calculateYearsToRetirement(); 
		
		System.out.println("my name is " +person1.name + " I have " + years + " years til retirement");
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		
		
	}

}
