package constructor;

public class Member {
	//객체(변수) 두개 생성
	private String name="패티";
	private int age=22;
	
	//디폴트 생성자 
	public Member() {
//		객체에서 변수 선언하는 것과 디폴트에서 변수를 선언하는 것은 결과적으로 같다 
//		name="패티";
//		age=22;
	}
	//생성자 : 값을 초기화
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//출력 수행
	public void view() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	

	
}
