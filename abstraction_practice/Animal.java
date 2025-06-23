package abstraction;

abstract class Anim {
	    abstract void makeSound();
	}

	class Dog extends Anim{
	    void makeSound() {
	        System.out.println("Woof!");
	    }
	}

	public class Animal {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.makeSound(); 
	    }
	}



