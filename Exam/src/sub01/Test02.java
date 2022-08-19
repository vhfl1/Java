package sub01;
import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 윤사랑
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.println("올해 연도 입력 : ");
		year = sc.nextInt();
		System.out.println("태어난 연도 입력 : ");
		birth = sc.nextInt();//숫자 출력
		System.out.println("이름 입력 : ");
		name = sc.next();//숫자 아니라서 int 붙이면 안됨
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세입니다.", name, age);
		
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
