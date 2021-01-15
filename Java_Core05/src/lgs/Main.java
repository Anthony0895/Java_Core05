package lgs;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Task 1");
		Cow p1 = new Cow();
		Dog p2 = new Dog();
		Cat p3 = new Cat();
		
		p1.voice();
		p2.voice();
		p3.voice();
		
		
		System.out.println();
		System.out.println("Task 3");
		
		Amphibia h = new Frog();
		 h.eat();
		 h.sleep();
		 h.swim();
		
	}

}
