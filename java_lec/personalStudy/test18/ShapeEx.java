package test18;
/*
[문제18]생성자 overload를 이용하여 프로그램을 만드시오
(1) package명은 test18로 하고 Shape.java   ShapeEx.java파일을 만드시오
(2) 파일명 : Shape  --main()포함 X
+Shape(x:int)                       --> 원의넓이를 구해서 출력(원의넓이=반지름*반지름*3.14)
+Shape(x:int, y:int)               --> 사각형의 넓이를 구해서 출력(사각형의넓이=가로*세로)
+Shape(x:int, y:int, z:int)       --> 사다리꼴의 넓이를 구해서 출력(사다리꼴의 넓이=(밑변 + 윗변 )*높이/2)
          
(3) 파일명 : ShapeEx   --main()포함 O
new Shape(3);
new Shape(4,5);
new Shape(3,4,7);

(4) 출력화면
원의넓이 : 28.274337
사각형의넓이 : 20.0
사다리꼴의넓이 : 24.5
 */
public class ShapeEx {

	public static void main(String[] args) {
		new Shape(3);
		new Shape(4,5);
		new Shape(3,4,7);
		
	}

}
