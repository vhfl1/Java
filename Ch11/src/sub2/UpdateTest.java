package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 윤사랑
 * 내용 : JDBC Insert 실습하기
 */
public class UpdateTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계-JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//2단계-데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계-SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계-SQL 실행
			String sql = "UPDATE `User2` SET `name`='홍길동', `hp`='010-1111-1111' ";
				   sql += "WHERE `uid`='a101';";
			
		    stmt.executeUpdate(sql);
			
			//5단계
			//6단계-데이터베이스 종료
			stmt.close();
			conn.close();
						
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			System.out.println("UPDATE 완료...");
	}
	
}
