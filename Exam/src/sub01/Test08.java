package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 윤사랑
 * 내용 : 1~10까지의 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test08 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0 ; i<n ; i++) {
			
			for(int j=n-1 ; j>i ; j--) {
				System.out.print(" ");
			}
			
			for(int j=0 ; j < 2 * i + 1 ; j++) {
				System.out.print("*");
		}
			System.out.print("\n");
	}
	
}	
	
	
	
	
}
