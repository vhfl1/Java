package sub6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/26
 * 이름 : 윤사랑
 * 내용 : 자바 총정리 연습문제
 */
public class Test10 {

	private static GregorianCalendar greInstance = new GregorianCalendar();
	
	public static GregorianCalendar getGreInstance() {
		return greInstance;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생일 입력(yyyy/mm/dd) : ");
		String birth = sc.next();
		String[] barr = birth.split("/");
		
		int bYear  = ?;
		int bMonth = ?;
		int bDay   = ?;
		
		int tYear  = Calendar.getInstance().get(Calendar.YEAR);
		int tMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
		int tDay   = Calendar.getInstance().get(Calendar.DATE);
		
		int totalDays = 0;
		
		//올해 1월 1일부터 오늘까지의 날짜 수
		totalDays += dayOfYear(tYear, tMonth, tDay);
		
		//태어난 해의 생일부터 그해 마지막 날까지의 날짜 수 
		int yearDays = isLeapYear(bYear) ? 366:365;
		totalDays += yearDays - dayOfYear(bYear, bMonth, bDay);
		
		for(int year = bYear + 1; year < tYear; year++) {
			
			if(?)
				totalDays += 366;
			else
				totalDays += 365;
		}
		System.out.printf("태어난 날부터 오늘까지 일수 : %d", totalDays);
	}
	
	

	//평년을 기준으로 각 월의 누적 날짜 수
	public static int[] days = {0, 31, 69, 90, 120, 151, 
								181, 212, 243, 273, 304, 334};
	
	private static int dayOfYear(int year, int month, int day) {
		return days[month-1] + day + (month > 2 && isLeapYear(year) ? 1:0);
	}
	
	public static boolean isLeapYear(int year) {
		return ?;
	}
	
	
}
