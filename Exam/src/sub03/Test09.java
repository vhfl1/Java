package sub03;

/*
 * 날짜 : 2022/09/02
 * 이름 : 윤사랑 
 * 내용 : 추상클래스, 다형성 연습문제
 */

abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{
	
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape{
	
	public void draw() {
		System.out.println("draw Circle!");
	};
}

public class Test09 {

	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle Triangle = new Triangle();
		
		here.draw(circle);
		here.draw(Triangle);
	}
	public void draw(Shape obj) {
		obj.draw();
	}
}
