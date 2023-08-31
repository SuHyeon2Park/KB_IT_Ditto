package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {
	public static void main(String[] args) {
		//xml �������� �б�
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//MyCalc mc = context.getBean(MyCalc.class);
		
		//int result = mc.plus(3,4);
		//System.out.println( result );
		
		//MyCalc mc3 = context.getBean(MyCalc.class);
		
		//System.out.println(mc == mc3); //��ȯ���� true��� ����.
		
		
		//annotation���� �������� �б�
		//ApplicationContext context2 = new AnnotationConfigApplicationContext(AppContext.class);
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppContext.class, AppContext2.class);
		MyCalc mc2 = context2.getBean(MyCalc.class);
		
		
		int result2 = mc2.plus(3,4);
		System.out.println( result2 );
	}
}
