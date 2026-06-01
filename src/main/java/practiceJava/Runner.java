package practiceJava;

public class Runner {

	public static void main(String[] args) {
		
		Person P1 = new Person("Paru");
		System.out.println(P1);
		P1.display();
		
		Person P2 = new Person("Nithya");
		System.out.println(P2);
		
		Person P3 = new Person(P1);
		System.out.println(P3);
		
		
		
		

	}

}
