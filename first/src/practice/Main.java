package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		System.out.println("종: "+cat.species +"이름: "+ cat.name +"나이: "+ cat.age);
//		cat.makeSound();
//		System.out.println("종: "+dog.species + "이름: "+dog.name + "나이: "+dog.age);
//		dog.makeSound();
		
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		Bus bus = new Bus();
		System.out.println("Car은 바퀴가: "+car.getWheel()+"개 있다. 그리고 창문은: "+car.getWindows() + car.getCeiling());
		System.out.println("Bus는 바퀴가: "+bus.getWheel()+"개 있다. 그리고 창문은: "+bus.getWindows()+"그리고 천장은: "+bus.getCeiling());
		System.out.println("motorcycle은 바퀴가: "+ motorcycle.getWheel()+"개 있다.");
	}

}


