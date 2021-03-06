package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//TV 인터페이스 상속
//Override으로 구성
//4개 다 비슷한 용도 / 이름 나누는 용도로 사용
//@Component("tv")
@Controller
//@Service
//@Repository
public class LgTv implements TV {
	
	//LG TV에 스피커 주입
	@Autowired //자동으로 엮겠다
	@Qualifier("appleSpeaker") // 클래스명의 소문자로
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("엘지--- 전원 ON");
		
	}
	@Override
	public void powerOff() {
		System.out.println("엘지--- 전원 OFF");
		
	}
	@Override
	public void volumUp() {
	//	System.out.println("엘지--- 소리 UP");
		speaker.volumeUp();
	}
	@Override
	public void volumDown() {
		//System.out.println("엘지--- 소리 DOWN");
		speaker.volumeDown();
	}
}
