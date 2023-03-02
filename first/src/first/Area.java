package first;
public class Area {
	public int width;
	public int height;
	// 생성자
	public Area(int width, int height) {
		this.width = width;
		this.height = height;
	}
	//메소드
	public void thisArea() {
		System.out.println(width*height);
	}
}
