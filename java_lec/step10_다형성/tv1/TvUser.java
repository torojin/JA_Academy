package tv1;
//결합도가 높은 코드
public class TvUser {

	public static void main(String[] args) {
		//배열처리
		String com=args[0];
		
		if(com.equals("LG")||com.equals("lg")) {//com=="LG"
			//Object 생성
			LgTv tv=new LgTv();
			tv.powerOn();
			tv.powerOff();
			tv.volumeUp();
			tv.vloumeDown();
		}else if(com.equals("SAMSUNG")||com.equals("samsung")) {//com=="SAMSUNG"
			SamsungTv tv=new SamsungTv();
			tv.turnOn();
			tv.turnOff();
			tv.soundUp();
			tv.soundDown();
		}
	}

}
