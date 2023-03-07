package first;

public class Student extends Person {
	private String studenID;
	
	public Student() {
		// Person 생성자 실행되고 있음.
		//super();//이렇게 적어줘도 됨.
		//super("홍길동", 99);//이렇게 생성자를 직접 호출할 수도 있음.
		this.name = "성춘향";
//		this.age = 99; age는 private로 되어 있어서 안된다.
		System.out.println("student 생성자 실행 됨.");
	}
	
	// 메소드 오버라이딩:
	// 함수명, 매개변수 모든 게 다 같은 상태에서 다시 정의하는 것이다.
	
	public void test() {
		System.out.print("student test");
	}
	public void sleep() {
		System.out.println("1시에 쿨쿨 잠을 잔다.");
	}
	public void study() {
		System.out.println("공부하기");
	}
	public String getStudenID() {
		return studenID;
	}
	public void setStudenID(String studenID) {
		this.studenID = studenID;
	}
	
}
