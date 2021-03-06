package polymorphism;

//TV 인터페이스 상속
public class SamsungTv implements TV {
	
	//private SonySpeaker speaker;
	private Speaker speaker;
	private int price;
	
	//생성자 생성
	public SamsungTv() {
		System.out.println("삼성 기본 생성자 호출됨");
	}
	
	//sonySpeaker를 받을 수 있는 생성자를 만들겠다
	//DI...
	//매개변수에 어떤 Speaker가 들어와도 각각 스피커를 실행..?
	public SamsungTv(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("삼성 --- 주입 생성자1 호출됨");
	}
	public SamsungTv(Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
		System.out.println("삼성 --- 주입 생성자2 호출됨");
	}
	
	//생성자로 주입할거냐, setter로 주입할 거냐의 차이
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("삼성 --- 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("삼성--- 전원 OFF");
	}
	@Override
	public void volumUp() {
		//System.out.println("삼성--- 소리 UP");
		//speaker = new SonySpeaker();
		speaker.volumeUp();	
	}
	@Override
	public void volumDown() {
		//System.out.println("삼성--- 소리 DOWN");
		//speaker = new SonySpeaker();
		speaker.volumeDown();
		
	}
	public void initMethod() {
		System.out.println("삼성--- 초기화 코드...");
	}
}

