package spring01;

public class MyCalc {
	//사용기록 남기기. MyLog클래스는 Dto 클래스가 아님. 그러므로 초기화를 null로 잡아준다.
	private MyLog log = null;
	private MyFileLog flog = null;
	
	public MyCalc() {
		
	}
	
	//setter
	public void setLog(MyLog log) {
		this.log = log;
	}
	public MyCalc(MyLog log) {
		this.log = log;
	}
	
	public int plus(int i, int j) {
		log.log(i + "+" + j + "=" + (i+j));
		return i + j;
	}
}
