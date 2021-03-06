package inheritance;

//부모 클래스 상속 처리
public class SubTest extends SuperTest{
	//필드(변수) 선언
	private int age;
	private double score;
	//디폴트 생성자 생성
	public SubTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	//매개변수 생성자 생성
	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age=age;
		this.score=score;
	}
	
	//toString 생성
	@Override
	public String toString() {
		return super.toString()+"\n나이는 " + age + "세이고" + score + "점 입니다";
	}
		
	public static void main(String[] args) {
		SubTest ob=new SubTest("크롱", "강남", 23, 85.4);
		//--출력
		//이름은 크롱이고 사는 곳은 강남입니다.
		//나이는 23세이고 점수는 85.4점입니다.
		System.out.println(ob.toString());
		
		
	}

}
