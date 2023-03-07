package first;

public class Rectangle {
	private int width;
	private int height;
	public static int num1 = 0;
	public static void showNum1() {
		System.out.println("인스턴스 개수는: " + num1);
	}
	//생성자
	public Rectangle(int width) {
		this.width = width;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	//getter & setter
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//메소드
	public int area() {
		return width * height;
	}
}
