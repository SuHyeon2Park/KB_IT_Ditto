package spring01;

public class NumberGuess {
	//난수변수
	private int com_num = new java.util.Random().nextInt(100)+1;
	//판정 메서드
	public String checkNumber(int num) {
		if(com_num == num) {
			return "정답";
		}
		if(com_num < num) {
			return "낮춰주세요";
		}
		if(com_num > num) {
			return "올려주세요";
		}
		return null;
	}//end checkNumber()
}

