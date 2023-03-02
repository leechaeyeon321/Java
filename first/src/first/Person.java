package first;

public class Person {
	
	public String name;
	public int age;
	
	// 생성자
//	public Person(String myname, int myage) {
//System.out.println("welcome");
	//	this.name = myname;
		//this.age= myage;
	//}
	
	
	//메소드
	public void myname() {
		System.out.println("my name is " + name);
	}
	//getter & setter
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
