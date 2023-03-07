package first;
import test.TestClass; 
//패키지 이름을 쓴 뒤 .을 입력하면 파일명나오는데 선택 후 사용

public class ClassName extends TestClass {
	public int number;
	public static String name;
	public void test() {
		System.out.println("이건 테스트야");
		//n n2
		
		this.n = 3;
		// this.n2 = 4;
		//접근 제어자 default는 자식 클래스에서 접근이 불가능..
	}
}
