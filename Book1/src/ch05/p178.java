package ch05;

public class p178 {

	String lineNumber;
	int passengerCount;
	int money;
	
	public p178(String lineNumber) {
		this.lineNumber = lineNumber;	
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은" + passengerCount + "명이고, 수입은"+ money + "입니다.");
	}	
}
