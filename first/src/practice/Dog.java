//Dog
package practice;

public class Dog extends Animal {
	public Dog() {
		this.species = "리트리버";
		this.name = "노랑이";
		this.age = 3;
	}
	public void makeSound() {
		System.out.println("월!");
	}
}
