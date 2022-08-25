package sub3;

public class Calc {

	private Calc() {}
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	public int plus(int x, int y) {
		return x + y ;
	}

	public int minus(int x, int y) {
		return x - y ;
	}
	
	public int multi(int x, int y) {
		return x * y ;
	}
	
	public int div(int x, int y) {
		return x / y ;
	}
	
}
