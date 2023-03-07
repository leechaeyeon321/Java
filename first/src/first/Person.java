package first;

public class Person {
	protected String name;//동일 패키지 혹은 자식이면 가능.
	private int age;
	// 메소드 오버라이딩:
	// 부모클래스에서 정의한 메소드를 자식클래스에서 다시 정의하는 것.
	public void test() {
		System.out.println("test");
	}
	// 함수 오버로딩:
	// 같은 이름의 함수를 쓸 수 있다. 매개변수는 달라야 함.
	//생성자
	public Person() {
		System.out.println("사람 클래스의 인스턴스 생성됨.");
	}
	
	public Person(String name, int age) {
		System.out.println("사람 클래스의 인스턴스 생성됨2");
		this.name = name;
		this.age = age;
	}
	//메소드
	public void sleep() {
		System.out.println("10시에 쿨쿨 잠을 잔다.");
	}
	public void sleep(int n) {
		System.out.println("쿨쿨 잠을 잔다.2");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
