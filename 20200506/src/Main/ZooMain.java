package Main;

import animal.Dog;
import zoo.Cat;

public class ZooMain {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		Dog d = new Dog();
		
		// c.happy();�� ���ټ����� default�� ȣ���� �ȵ�
		c.makeSound();
		d.welcome(c);
	}
}
