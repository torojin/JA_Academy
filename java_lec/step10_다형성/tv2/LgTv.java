package tv2;

//interface 상속 / Override 
public class LgTv implements Tv {
	//power Method 선언
	@Override
	public void powerOn() {
		System.out.println("LG TV-전원을 켠다");
	}
	@Override
	public void powerOff() {
		System.out.println("LG TV-전원을 끈다");
	}
	//sound Method 선언
	@Override
	public void soundUp() {
		System.out.println("LG TV-소리를 높인다");
	}
	@Override
	public void soundDown() {
		System.out.println("LG TV-소리를 줄인다");
	}
}
