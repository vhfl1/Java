package sub7;
/*
 * 날짜 : 2022/09/28
 * 이름 : 윤사랑
 * 내용 : 자바 총정리 연습문제
 */
class Artists{
	public String name;
	public String country;
	public int birth;
	
	?
			
	public String show() {
		return String.format("%s, %s, %d", name, country, birth);
	}
}

public class Test02 {
	
	public static void main(String[] args) {
	
		Artists[] famousArts = {
				?
		};
		
		for(Artists art : famousArts) {
			System.out.println(art.show());
		}
		
	}
}
