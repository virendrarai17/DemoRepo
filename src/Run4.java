class Animal{
	void makeSound(){
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Meow Meow");
	}
}

public class Run4 {

	public static void main(String[] args) {
		 Animal a;
		 a=new Dog();
		 a.makeSound();
		 
		 a=new Cat();
		 a.makeSound();

	}

}
