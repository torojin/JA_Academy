package object;

import java.util.Scanner;

//클래스 생성 
//주의사항* Navigate에 있는 클래스 이름이 중복이 되면 안됨
class MemberPhone{
	//필드
	private String name;
	private String phone;//전화번호는 자료형 String을 씀
	//
	public void input() {
		//BufferedReader와 비슷?
		//Scanner는 기능이 BufferedReader보다 간소화되서 속도도 느리고 디테일하게 작업은 못함 
		//파일에서 입력받을 수도 
		Scanner sc=new Scanner(System.in);// buffer보다 속도가 느리다, Scanner가 사용하기 쉬워서 사용한다.
		System.out.print("이름을 입력하세요 : ");
		name=sc.nextLine();
		
		System.out.print("전화번호를 입력하세요 : ");
		phone=sc.nextLine();
		
		//Scanner사용할때 close()를 해줘야함
		//외부 장치와 연결할 때도 닫아줘야함
		sc.close();
	}
	//출력문
	public void output() {
		System.out.println(name+" 고객님의 전화번호는 "+phone+"입니다.");
	}

}
public class ObjectEx6 {

	public static void main(String[] args) {
		//메인 함수
		MemberPhone mp=new MemberPhone();
		mp.input();
		mp.output();
	}

}
