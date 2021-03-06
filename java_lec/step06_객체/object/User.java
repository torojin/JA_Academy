package object;
/* 클래스 다이어그램 표기
 * -(private) +(public) #(protected)
 * +name:String
 * +k:int
 * +e:int
 * +m:int
 * 
 * +setUser(name:String, k:int, e:int, m:int) :void
 * +getTotal(): int
 * +getUser(): String //getUser는 getTotal 호출
 * 
 */
//필드랑 메서드가 합쳐진게 객체
//객체=속성+동작 / 속성이랑 동작 둘중 하나만 있어도 객체가 될 수 있다.
public class User {
	//필드 =속성
	public String name;
	public int k;
	public int e;
	public int m;
	//메서드=동작
	//void 원하는 값의 형태가 아닌 제어만
	public void setUser(String name, int k, int e, int m) {
		/*name=n;
		k=kor;
		e=eng;
		m=mat;
		*/
		//this 활용
		this.name=name;
		this.k=k;
		this.e=e;
		this.m=m;	
	}
	
	//return 자료형이여서 return이 필요하다.
	public int getTotal() {
		return k+e+m;
	}
	//return ""; 문자열 초기화
	public String getUser() {
		return "이름은 "+name+"이고, 총점은 "+getTotal()+"점입니다.";
	}
}
