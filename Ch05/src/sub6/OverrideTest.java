package sub6;
/*
 * 날짜 : 2022/08/31
 * 이름 : 윤사랑
 * 내용 : Override 실습하기
 * 
 * 오버라이드(Override)
 *  부모클래스의 메서드를 자식클래스에 맞게 재정의하는 것
 *  오버라이드를 통해 객체지향 프로그래밍의 다형성 실현
 */
public class OverrideTest {

	public static void main(String[] args) {
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0, 0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.speedUp(100);
		bongo.show();
	}
}
