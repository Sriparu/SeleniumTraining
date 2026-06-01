package practiceJava;

public class Person{
	//Create Instance variables
	private String name;
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
//	public Person() {
//		//Default Constructor
//		System.out.println("Default Constructor");
//	}
//	
	public Person(String name) {
		super();
		this.name = name;//Initializing the Instance variable name
	}
	
	//Copy Constructor
	public Person(Person ref) {
		this.name = ref.name;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Method to display data
	public void display() {
		System.out.println("Person name is: " + name);
	}
}
