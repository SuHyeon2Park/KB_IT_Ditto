package spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration //자바클래스로 빈 등록하는 방법.
//@Import(AppContext2.class) Autowired와 같은 기능을 수행하는 다른방법
public class AppContext { // 해당 클래스 명은 AppContext말고 다른 명으로 해도 된다. 
	//밑에 있는 애들은 객체조립기 라고 부른다.
	
	@Autowired //자동주입기능
	private MyLog log;
	@Bean
	public HelloService hello() {
		return new HelloServiceEn();
	}
	@Bean
	public MyCalc mc() {
		//return new MyCalc( filelog() ); // 생성자를 통한 DI
		
		//Setter메서드를 통한 DI
		MyCalc mc = new MyCalc();
		mc.setLog(log);
		return mc; 
	}
}
