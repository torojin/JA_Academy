package test24;
/*
[����24]���� �������� �޾� ���̸� ����ϰ� ����Ͻÿ�
(1)package���� test24�� �ϰ� Circle.java, CircleRound.java , 
CircleSize.java, MainEx.java ����ÿ�

(2)Ŭ������ : Circle
-r:int
+Circle()
+Circle(r:int)
+setter & getter
+getCalc():double 
+toString():String    ==>  ������ : 10  /   ������ : 5 ���


(3)Ŭ������ : CircleRound
+CircleRound()
+CircleRound(r:int)
+getCalc():double   ==> ���� �ѷ��� ���Ѵ�(������*2*3.14)
+toString():String    ==> ���� �ѷ��� 62.8�Դϴ�   ���

(4)Ŭ������ : CircleSize
+CircleSize()
+CircleSize(r:int)
+getCalc():double   ==> ���� ���̸� ���Ѵ�(������*������*3.14)
+toString():String    ==> ���� ���̴� 78.5�Դϴ� ���

(5) Ŭ������ : MainEx
CircleRound ob1=new CircleRound(10);
System.out.println(ob1.toString());

CircleSize ob2=new CircleSize(5);
System.out.println(ob2.toString());

(6)���ȭ��
������ : 10
���� �ѷ��� 62.8�Դϴ�

������ : 5
���� ���̴� 78.5�Դϴ�


 */
public class MainEx {

	public static void main(String[] args) {
		CircleRound ob1=new CircleRound(10);
		System.out.println(ob1.toString());

		CircleSize ob2=new CircleSize(5);
		System.out.println(ob2.toString());
	}

}