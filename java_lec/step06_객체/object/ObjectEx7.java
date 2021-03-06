package object;

import java.util.Scanner;

/*
 * 클래스 Trapezoid.java
 * *** 사다리 꼴의 넓이 구하기 ***
 * 밑변을 입력하세요 : 5
 * 윗변을 입력하세요 : 4
 * 높이를 입력하세요 : 3
 * 
 * 넓이 : 13.5
 * 
 * 
 * 한 번 더 계산할까요?(Y/y) n //do while문사용
 * *** 수고 하셨습니다 ***
 *
 */


public class ObjectEx7 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc=new Scanner(System.in);
		//객체 생성
		Trapezoid tz=new Trapezoid();
		//do-while 내부에서 입력처리
		//입력처리
		//계산처리
		//재수행 처리
		//조건 검사
		
		int base, top, height;
		char ans;
		do {
			System.out.println("*** 사다리 꼴의 넓이 구하기 ***");
			System.out.print("밑변을 입력하세요 : ");
			base=sc.nextInt();
			System.out.print("윗변을 입력하세요 : ");
			top=sc.nextInt();
			System.out.print("높이을 입력하세요 : ");
			height=sc.nextInt();
			
			tz.setTrapezoid(base, top, height);//입력된 값을 setTrapezoid로 넘김
			
			System.out.println(tz.toString());
			
			sc.nextLine();//버퍼 비우기 해야 에러 발생안함
			
			System.out.print("한 번 더 계산할까요?(Y/y)");
			ans=sc.nextLine().charAt(0);
			//ans=sc.next().charAt(0);로 처리하면 sc.nextLine(); 안써도 됨
			//단어 하나만 처리 next()
			//엔터까지 포함해서  nextLine()은 문장으로 처리해서 버퍼비우기를 해줘야함
			
		}while(ans=='Y'|| ans=='y');//Y/y일때 다시 실행
		sc.close();//종료하기 직전에 닫아줘야 반복문이 작동됨
		System.out.println("***수고 하셨습니다.***");
	}

}
