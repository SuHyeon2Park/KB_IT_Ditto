package spring01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberContext {
	@Bean
	public MemberDao memberDao() { // 리턴타입을 MemberDaoImpl이어도 된다.
		return new MemberDaoImpl();
	}
	@Bean 
	public MemberDao memberMySqlDao() { // 리턴타입을 MemberDaoImpl이어도 된다.
		return new MemberDaoMySqlImpl();
	}
	
	@Bean
	public MemberService memberService() {
		return new MemberService();
	}
}
