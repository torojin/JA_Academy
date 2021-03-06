package constructor;

import java.util.Scanner;

/*
 * 생성자에서 두 수를 입력받아 큰 수 작은 수를 출력하세요
 * show()메서드에서 maxValue(), minValue()를 호출할 것
 * 
 * 클래스 : Max
 * -a:int
 * -b:int
 * +Max()
 * +maxValue():int
 * +minValue():int
 * +show():void
 * --출력
 * Input a : 5
 * Input b : 3
 * 
 * 큰수 : 5
 * 작은 수 :3
 */
class Max{
	//필드 
	private int a;
	private int b;
	//맥스 생성자
	public Max() {
		//입력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input a :");
		a=sc.nextInt();
		System.out.print("Input b :");
		b=sc.nextInt();
		sc.close();
	}
	public int maxValue() {
		//삼항연산자 a가b보다 큰가 맞으면 a 아니면 b
		return (a>b)?a:b;
	}
	public int minValue() {
		return (a<b)?a:b;
	}
	public void show() {
		System.out.println("큰수 : "+maxValue());
		System.out.println("작은 수 : "+minValue());
	}
}


public class ConstructorEx6 {

	public static void main(String[] args) {
		//객체 생성
		/*
		Max m=new Max();
		m.show();
		*/
		new Max().show();
		
	}

}
