package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// ���1
		//xml �������� �б�
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //ApplicationContext�� 
		
		// �������Ͽ��� HelloService �˻�
		HelloService hs = context.getBean(HelloService.class);
		//HelloService hs = new HelloService(); //�������� ����ϰ� �Ǹ� new ������ �ڿ��� ���������� �����Ѵ�(�ٷ� ���� �ڵ��� �������� �ۼ��ϸ� �ȴ�.). ���ڵ�� �ٷ� ���� �ڵ�� ���� �ǹ�		
		
		String msg = hs.hello();
		System.out.println( msg );
		
		// ���2
		//annotation���� �������� �б�
		//ApplicationContext context2 = new AnnotationConfigApplicationContext(AppContext.class);
		
		// �������Ͽ��� HelloService �˻�
		//HelloService hs2 = context2.getBean(HelloService.class);
		
		//String msg2 = hs2.hello();
		//System.out.println( msg2 );
	}
}
