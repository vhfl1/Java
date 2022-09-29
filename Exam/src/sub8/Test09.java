package sub8;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2022/09/29
 * 이름 : 윤사랑
 * 내용 : 자바 총정리 연습문제
 */
public class Test09 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Gugudan.txt";
		
		try{
			File file = new File(path);
			FileWriter fw = new FileWriter(File);
			
			for(int x = 2; x <= 9; x++) {
				?
						
				for(int y = 1; y <= 9; y++) {
					int z = x * y;
					?;
				}
			}
			
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("구구단 파일 생성 완료...");
	}
}
