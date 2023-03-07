//부모
package practice;
public class Vehicle {
	private int wheel;
	
	public Vehicle() {
		System.out.println("vehicle 인스턴스 생성");
	}
	public Vehicle(int wheel) {
		this.wheel = wheel;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
}
