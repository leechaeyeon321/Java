package first;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Rectangle> rect = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Number number1
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			if(width==0 && height==0) break;
			
			Rectangle rectangle1 = new Rectangle(width);
			rectangle1.setHeight(height);
			rect.add(rectangle1);
		}
		for(Rectangle rectangle : rect) {
			System.out.println(rectangle.getWidth());
			System.out.println(rectangle.getHeight());
			System.out.println(rectangle.area());
			//arrayList에서는 length대신 size 사용
			System.out.println("----------------------");
		}System.out.println("Rectangle 인스턴스의 개수는: "+rect.size());
		
	};
};