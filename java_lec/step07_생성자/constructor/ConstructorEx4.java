package constructor;

import java.util.Scanner;

/*
 * 클래스명  : ConstructorEx4
 * x:int
 * y:int
 * 
 * +ConstructorEx4() --입력처리(스캐너)
 * +clac():int		 --x*y를 리턴
 * +display():void	 --출력하기
 * 
 * 가로를 입력 : 5
 * 세로를 입력 : 4
 * 
 * 사각형의 넓이 : 20
 */

public class ConstructorEx4 {
	//filed
	private int x;
	private int y;
	
	//생성자
	public ConstructorEx4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("가로를 입력 : ");
		x=sc.nextInt();
		System.out.print("세로를 입력 : ");
		y=sc.nextInt();		
		sc.close();
	}
	public int clac() {
		return x*y;
	}
	//호출을 위한 void
	public void display() {
		System.out.println("사각형의 넒이 : "+clac());
	}
	//메인 메서드
	public static void main(String[] args) {
		new ConstructorEx4().display();
	}

}
