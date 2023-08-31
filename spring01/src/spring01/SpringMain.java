package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// 방법1
		//xml 설정파일 읽기
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //ApplicationContext란 
		
		// 설정파일에서 HelloService 검색
		HelloService hs = context.getBean(HelloService.class);
		//HelloService hs = new HelloService(); //스프링을 사용하게 되면 new 연산자 뒤에는 스프링에서 관리한다(바로 이전 코드의 형식으로 작성하면 된다.). 이코드는 바로 이전 코드랑 같은 의미		
		
		String msg = hs.hello();
		System.out.println( msg );
		
		// 방법2
		//annotation으로 설정파일 읽기
		//ApplicationContext context2 = new AnnotationConfigApplicationContext(AppContext.class);
		
		// 설정파일에서 HelloService 검색
		//HelloService hs2 = context2.getBean(HelloService.class);
		
		//String msg2 = hs2.hello();
		//System.out.println( msg2 );
	}
}
