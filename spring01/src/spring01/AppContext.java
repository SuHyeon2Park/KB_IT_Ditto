package spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration //�ڹ�Ŭ������ �� ����ϴ� ���.
//@Import(AppContext2.class) Autowired�� ���� ����� �����ϴ� �ٸ����
public class AppContext { // �ش� Ŭ���� ���� AppContext���� �ٸ� ������ �ص� �ȴ�. 
	//�ؿ� �ִ� �ֵ��� ��ü������ ��� �θ���.
	
	@Autowired //�ڵ����Ա��
	private MyLog log;
	@Bean
	public HelloService hello() {
		return new HelloServiceEn();
	}
	@Bean
	public MyCalc mc() {
		//return new MyCalc( filelog() ); // �����ڸ� ���� DI
		
		//Setter�޼��带 ���� DIfdfddfdfdfdfdfdadasdadadadadad
		MyCalc mc = new MyCalc();
		mc.setLog(log);
		return mc; 
	}
}
