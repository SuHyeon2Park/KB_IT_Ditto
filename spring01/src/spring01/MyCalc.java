package spring01;

public class MyCalc {
	//����� �����. MyLogŬ������ Dto Ŭ������ �ƴ�. �׷��Ƿ� �ʱ�ȭ�� null�� ����ش�.
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
