package tv2;
//결합도가 낮은 코드, 다형성 이용
public class TvUser {

	public static void main(String[] args) {
		//배열처리
		String com=args[0];
		//tv 객체 생성
		Tv tv=null;
		
		if(com.equals("LG")||com.equals("lg")) {//com=="LG"
			//Object 생성
			tv=new LgTv();
		}else if(com.equals("SAMSUNG")||com.equals("samsung")) {//com=="SAMSUNG"
			tv=new SamsungTv();
		}else {
			System.out.println("error");
		}
		tv.powerOn();
		tv.powerOff();
		tv.soundUp();
		tv.soundDown();
	}

}
