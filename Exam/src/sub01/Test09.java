package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 윤사랑
 * 내용 : 1~10까지의 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test09 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1 ; i <=9 ; i++) {
			
			if(i<=5) {
				count++;
			}else {
				count--;
			}
			
		for(int j=1 ; j <=5-count ; j++) {
			System.out.println(" ");
		}
		
		for(int k=1 ; k<=2*count-1 ; k++) {
			System.out.println(" ");
		}
		
		System.out.println("\n");
		}
	}
	
	
	
	
	
	
	
}
