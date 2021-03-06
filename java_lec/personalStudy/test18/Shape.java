package test18;
/*
(2) 파일명 : Shape  --main()포함 X
+Shape(x:int)                       --> 원의넓이를 구해서 출력(원의넓이=반지름*반지름*3.14)
+Shape(x:int, y:int)               --> 사각형의 넓이를 구해서 출력(사각형의넓이=가로*세로)
+Shape(x:int, y:int, z:int)       --> 사다리꼴의 넓이를 구해서 출력(사다리꼴의 넓이=(밑변 + 윗변 )*높이/2)
 */
public class Shape {
	//상속자 
	public Shape(int x) {
		System.out.println("원의 넓이 : "+(x*x*3.141592));
	}
	public Shape(int x, int y) {
		System.out.println("사각형의 넓이 : "+(double)(x*y));
	}
	public Shape(int x, int y, int z) {
		System.out.println("사다리꼴의 넓이 : "+(x+y)*z/2.0);
	}
}
