package Main;

import animal.Dog;
import zoo.Cat;

public class ZooMain {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		Dog d = new Dog();
		
		// c.happy();는 접근수준이 default라서 호출이 안됨
		c.makeSound();
		d.welcome(c);
	}
}
