package test23;
/*
[����23] ���� ���α׷��� �ϼ��Ͻÿ�
(1) package���� test23�� �ϰ� Entry.java, SubEntry.java, MainEx.java ������ ����ÿ�
(2)Ŭ������ : Entry
-word:String
+Entry()                            ==> **  ������ **    ���
+Entry(word:String)
+toString()String               ==> ��� : OOP   ���

Ŭ������ : SubEntry  ==> Entry���
-definition:String
-year:int
+SubEntry()
+SubEntry(definition:String, year:int)
+SubEntry(word:String, definition:String, year:int)
+toString():String           ==> ����, �ñ� ���


Ŭ������ : MainEx  
SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);	
System.out.println(ob.toString());

(3) ���ȭ��

*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��
 */
public class MainEx {

	public static void main(String[] args) {
		SubEntry ob=new SubEntry("OOP", "Object Oriented Programming", 1991);
		System.out.println(ob.toString());
	}

}
