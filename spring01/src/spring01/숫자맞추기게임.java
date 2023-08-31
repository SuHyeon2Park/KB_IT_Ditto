package spring01;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class 숫자맞추기게임 {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(GameContext.class); //Spring으로 설정
		
		//난수 생성, 판정메서드
		NumberGuess ng = context.getBean(NumberGuess.class); //Spring으로 설정
		Scanner sc = new Scanner(System.in);
		
		while(true) {////정답 맞출때까지 무한반복
			System.out.println("1~100사이 숫자를 입력");
			int num = sc.nextInt();
			String result = ng.checkNumber(num);
			System.out.println( result );
			if(result.equals("정답")) {
				break;
			}
		}// end while
		
		sc.close();
	}// end main
}
