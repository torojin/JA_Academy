package test24;
/*
[문제24]원의 반지름을 받아 넓이를 계산하고 출력하시오
(1)package명은 test24로 하고 Circle.java, CircleRound.java , 
CircleSize.java, MainEx.java 만드시오

(2)클래스명 : Circle
-r:int
+Circle()
+Circle(r:int)
+setter & getter
+getCalc():double 
+toString():String    ==>  반지름 : 10  /   반지름 : 5 출력


(3)클래스명 : CircleRound
+CircleRound()
+CircleRound(r:int)
+getCalc():double   ==> 원의 둘레를 구한다(반지름*2*3.14)
+toString():String    ==> 원의 둘레는 62.8입니다   출력

(4)클래스명 : CircleSize
+CircleSize()
+CircleSize(r:int)
+getCalc():double   ==> 원의 넓이를 구한다(반지름*반지름*3.14)
+toString():String    ==> 원의 넓이는 78.5입니다 출력

(5) 클래스명 : MainEx
CircleRound ob1=new CircleRound(10);
System.out.println(ob1.toString());

CircleSize ob2=new CircleSize(5);
System.out.println(ob2.toString());

(6)출력화면
반지름 : 10
원의 둘레는 62.8입니다

반지름 : 5
원의 넓이는 78.5입니다


 */
public class MainEx {

	public static void main(String[] args) {
		CircleRound ob1=new CircleRound(10);
		System.out.println(ob1.toString());

		CircleSize ob2=new CircleSize(5);
		System.out.println(ob2.toString());
	}

}
