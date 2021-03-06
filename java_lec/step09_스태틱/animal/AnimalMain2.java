package animal;
//동적 바인딩 : 런타임에 호출 함수를 결정, 코딩량이 줄어듬
//속도가 느려짐

import java.util.Scanner;

public class AnimalMain2 {

	public static void main(String[] args) {
		//입력할 수 있게 scanner 
		Scanner sc=new Scanner(System.in);
		
		int n;
		//객체 선언
		//부모클래스의 참조변수로 자식 객체 생성
		Animal ani=null;
		
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n선택 : ");
			n=sc.nextInt();
			//선택을 위한 switch문
			//자식객체 생성
			switch(n){
			case 1: ani=new Dog(); break;
			case 2: ani=new Cat(); break;//cat.java 자식 클래스에 speak메소드가 있으니까 "야옹"출력 / walk메소드가 없으므로 부모 클래스인 Animal.java로 가서 "네발로 걷는다" 출력
			case 3: ani=new Fish(); break;
			case 4: ani=new Duck(); break;
			default: System.out.println("***종료합니다***"); 
					sc.close();
					System.exit(0);
			}
			//Animal method 호출
			ani.speak();
			ani.walk();
		}
	}

}
