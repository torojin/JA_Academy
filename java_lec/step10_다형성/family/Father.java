package family;
//자식클래스 / 부모 클래스 Family /interface Job상속
public class Father extends Family implements Job{
	//default constructor
	public Father() {
		super();
	}
	public Father(String string) {
		super(string);
	}
	//interface 상속 / 오버라이드
	@Override
	public String work() {
		return "아빠는 나가서 일을 한다\n" ;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+this.work();
	}

}
