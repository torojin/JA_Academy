package animal;

import java.util.Scanner;

/*
 * Cat, Dog, Duck, Fish
 * cat은 야옹 네발로 걸어감
 * dog 멍멍 네발
 * Duck 꽥꽥 두발
 * Fish 소리가 없다 헤엄쳐서 다닌다
 * 공통점이 없으니 default 소리가 없다
 * default 네발
 */
//정적 바인딩 : 컴파일 시점에 호출 함수 결정
//좋은 방법은 아니다. 보통 동적바인딩을 많이 사용한다
//메모리에 저장되어 있어... 허용용량을 초과해서 블랙아웃처럼 동작이 될 수 있다.
public class AnimalMain1 {

	public static void main(String[] args) {
		//입력할 수 있게 scanner 
		Scanner sc=new Scanner(System.in);
		
		int n;
		//객체 선언
		Dog dd=null; Cat cc=null; Fish ff=null; Duck dk=null;
		
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n선택 : ");
			n=sc.nextInt();
			//선택을 위한 switch문
			switch(n){
			case 1: dd=new Dog(); dd.speak(); dd.walk(); break;
			case 2: cc=new Cat(); cc.speak(); cc.walk(); break;
			case 3: ff=new Fish(); ff.speak(); ff.walk(); break;
			case 4: dk=new Duck(); dk.speak(); dk.walk(); break;
			default: System.out.println("***종료합니다***"); 
					sc.close();
					System.exit(0);
			}
		}
	}

}
