package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기화블럭 : 스레드 간 경합을 막고 동기화방식으로 실행(하나 이상의 메서드가 동시에 진입하지 못하도록)
	public synchronized void setNum() {
		num++;
	}
}
