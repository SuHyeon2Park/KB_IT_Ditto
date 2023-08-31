package spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring01.dto.MemberDto;

public class MemberService {
	
	@Autowired(required = false) //여기서는 자동으로 MemberContext에 들어가있는 memberdao()메서드랑 연결이 되어서 객체를 만들어준다. 자동으로 클래스 타입에 해당하는 객체를 Context파일에서 찾아서 초기화해주는 어노테이션이라고 생각해라.
	@Qualifier("memberDao") //주입할 빈의 이름을 지정한다.
	//같은타입의 빈이 여러개 등록된 경우 빈의 이름으로 지정한다.
	private MemberDao dao = null;
	
	public boolean login(String id, String passwd) {
		System.out.println("dao = "+dao);
		return false;
	}
}
