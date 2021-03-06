package exercise;
/*
 [문제12]메인메서드에서 값을 입력받고  compute메서드를 호출하여 처리하시오
(1)입력받은 값을  compute(item, qty, price)메서에서 처리할것
(2)계산방법은  금액 = 수량 * 단가 로 하시오

[입력화면]
품명을 입력하시오 : apple
수량를 입력하시오 : 10
단가를 입력하시오 : 1200

[출력화면]
품명 : apple
금액 : 12000원
 */

import java.util.Scanner;

public class Exercise12 {
	
	//public void와 public static void의 차이?
	//public void는 setter에서 사용 / 값을 보낼때?
	//public void 객체를 만들어서 사용해야 한다.
	//public static void 그냥 클래스 메서드 객체 안만들어도 사용 가능
	//MethodEx8.java 참조할 것
	
	public void compute(String item, int qty, int price) {
		System.out.println("품명  : "+item);
		System.out.println("금액 : "+(qty*price)+"원");
	}

	public static void main(String[] args) {
		Exercise12 ex=new Exercise12();
		//scanner 
		Scanner sc=new Scanner(System.in);
		//입력
		String item;
		int qty,price;
		System.out.print("품명을 입력하세요 : ");
		item=sc.nextLine();
		
		System.out.println("수량을 입력하세요 : ");
		qty=sc.nextInt();
		
		System.out.println("단가를 입력하세요 : ");
		price=sc.nextInt();
		
		ex.compute(item, qty, price);
		sc.close();
	}

}
