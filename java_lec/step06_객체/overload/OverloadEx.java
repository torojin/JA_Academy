package overload;
//overload = 중복
/*
 * overload method(중복함수) : 같은 이름의 함수를 여러번 구현
 * 1. 반드시 함수 이름이 동일
 * 2. 매개변수의 타입이 다르거나 개수가 달라야 함
 * 
 */
public class OverloadEx {
	//private를 작성안하면
	//디폴트 default 접근 지정자가 된다
	int x=17; //전역변수
	int y=15; 
	
	public int max() {
		//삼항 연산자 사용
		return(x>y)?x:y;//x가 y보다 큰가? 왼쪽이 오른쪽 보다 큰가?
		//크면 x출력 아니면 y 출력
	}
	//내부에 있는 걸 사용?
	//함수 이름 동일 매개변수 타입 다름
	public int max(int x, int y) {
		return(x>y)?x:y;
	}
	//함수 이름 동일 매개변수 타입 다름
	public float max(float x, float y) {
		return(x>y)?x:y;
	}
	public static void main(String[] args) {
		//객체 생성
		OverloadEx ob=new OverloadEx();
		System.out.println("큰 수 : "+ob.max());
		System.out.println("큰 수 : "+ob.max(75,100));
		System.out.println("큰 수 : "+ob.max(75.5f,100.4f));
		
	}

}
