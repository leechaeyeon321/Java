//package first;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class Main {
//	public static void main(String[] args) {
//		Person p = new Person("홍길동", 80);
//		
//		Student s = new Student();
//		System.out.println(s.getName());
//		s.setName("성춘향");
//		System.out.println(s.getName());
//		p.sleep();
//		s.sleep();
//	}
//};
package first;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Rectangle> rect = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Rectangle r2 = new Rectangle();
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			if(width==0 && height==0) break;
			Rectangle rectangle1 = new Rectangle(width);
			rectangle1.setHeight(height);
			rect.add(rectangle1);
			r2.num1 +=1;
		}
		for(Rectangle rectangle : rect) {
			System.out.println("가로의 길이는"+rectangle.getWidth());
			System.out.println("세로의 길이는"+rectangle.getHeight());
			System.out.println("넓이는"+rectangle.area());
			//arrayList에서는 length대신 size 사용
			System.out.println("----------------------");
		}r2.showNum1();
	};
};