package inheritance;

public class SuperTest {
	//필드(변수)
	private String name;
	private String addr;
	//디폴트 생성자
	public SuperTest() {
		super();
	}
	//매개변수 생성자 생성
	public SuperTest(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	//toString
	@Override
	public String toString() {
		return "이름은 " + name + "이고 사는 곳은 " + addr + "입니다";
	}
	

	

}
