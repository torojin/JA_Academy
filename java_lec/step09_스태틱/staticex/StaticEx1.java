package staticex;



//클래스 생성
class Test{
	int x;
	int y;
	static int z;

	//static영역은 static으로 초기화 하고 싶은 변수를 넣어주면 됨?
	static {
		System.out.println("static 초기화 영역");
	}
	public Test(int x, int y, int z1) {
		this.x=x;
		this.y=y;
		z=z1; //여기서 초기화시킴? /최초의 1회 초기화?
		System.out.println("객체 초기화 영역");
	}

	public void view() {
		System.out.println(x+" "+y+" "+z);
	}
}

public class StaticEx1 {

	public static void main(String[] args) {
		//객체 생성
		Test ob1=new Test(1, 2, 3);
		//객체 하나 더 생성
		Test ob2=new Test(4, 5, 6);
		
		ob1.view();
		ob2.view();
	}

}
