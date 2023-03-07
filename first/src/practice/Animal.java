//Animal
package practice;

public class Animal {
	protected String species;
	protected String name;
	protected int age;
	//메소드
	public Animal() {
//		System.out.println("animal 클래스의 인스턴스 생성됨");
	}
	public Animal(String species, String name, int age) {
		System.out.println("Animal class 인스턴스 생성됨.");
		this.species = species;
		this.name = name;
		this.age = age;
	}
	public void makeSound() {
		System.out.println("동물은 소리를 낸다.");
	}
}
