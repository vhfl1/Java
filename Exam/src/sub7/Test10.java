package sub7;
/*
 * 날짜 : 2022/09/28
 * 이름 : 윤사랑
 * 내용 : 자바 총정리 연습문제
 */
class Human{
	public void print() {
		System.out.println("사람입니다.");
	}
}

class Man extends Human{
	public void print() {
		System.out.println("남자입니다.");
	}
}

class Woman extends Human{
	public void print() {
		System.out.println("여자입니다.");
	}
}

public class Test10 {

	public static void main(String[] args) {
		
		Human p1 = makeHuman(1);
		Human p2 = makeHuman(2);
	}
	
	public static Human makeHuman(int kind) {
		if(kind ==1) {
			return new Man();
		}else {
			return new Woman();
		}
	}
}
