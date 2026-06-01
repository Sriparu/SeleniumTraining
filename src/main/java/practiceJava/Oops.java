package practiceJava;

class Pen {
	String color;
	String type;
	
	public void write() {
		System.out.println("This Pen is Writing");
	}
	
	public void printcolor() {
		System.out.println(this.color);
		System.out.println(this.type); 
	}
}

class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(){
		System.out.println("Construcotr Called");
	}
    
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	

}
public class Oops {

	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.color = "Blue";
		p1.type =  "Gel";
			
		Pen p2 = new Pen();
		p2.color = "Green";
		p2.type = "BallPoint";
		
		p1.printcolor();
		p2.printcolor();
		
		Student s1 = new Student("Paru",50);	
		s1.printInfo();
		
		Student s2 = new Student(s1);
		
		
		
		
				
		

	}

}
