package test15;
/*
[����15] ������ �ϼ��Ͻÿ�
(1) package���� test15�� �ϰ� Triangle.java  TriangleEx.java������ ����ÿ�
(1)Ŭ������:Triangle   --main()���� X
-base:double
-height:double
+setData(base:int, height:int):void
+getSize():double
+getView():String

(2)Ŭ������:TriangleEx   --main()���� O
Triangle ob=new Triangle();
ob.setData(3,7);
System.out.println(ob.getView());

(3) �ﰢ���� ���� = (�غ� * ����) /2 ������ �̿��ϰ� 
     getSize()���� ����ϰ� ����� getView()���� �Ͻÿ�

(4) ���ȭ��
�ﰢ���ǳ��� : 10.50
 */
public class TriangleEx {

	public static void main(String[] args) {
		Triangle ob=new Triangle();
		ob.setDate(3, 7);
		System.out.println(ob.getView());
	}

}
