package interfaceex;
//----------------------------------------�������̽�
//Ŭ���� ����
//pm�� abstract class ���� ����
//
interface Shape{
	//�������̽����� final�̳� abstract�� ������ ���� ��������� ����� ����.
	/* final */ int r=10;
	/* abstract */ public void draw();//�̿ϼ� ������ Ŭ����
	/* abstract */ public void erase();
}
//�޼��忡 �������̵尡 �ȵǸ� ���� �޼����� ���
//�������̽��� ����̶�� ǥ�� ���ϰ� �����̶�� ǥ���Ѵ�.
class Circle implements Shape{
	@Override
	public void draw() { //���� �������̵�(������)
		System.out.println("�������� "+r+"�� ���� �׸���");
	}
	@Override
	public void erase() { //���� �������̵�
		System.out.println("���� �����");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		//��ü ����
		Circle cir=new Circle(); 
		cir.draw();
		cir.erase();
		
	}

}
//---------------------------------------�߻�(�̿ϼ�)Ŭ����
/*
//Ŭ���� ����
//pm�� abstract class ���� ����
//
abstract class Shape{
	final int r=10;
	abstract public void draw();//�̿ϼ� ������ Ŭ����
	abstract public void erase();
}
//�޼��忡 �������̵尡 �ȵǸ� ���� �޼����� ���
class Circle extends Shape{
	@Override
	public void draw() { //���� �������̵�(������)
		System.out.println("�������� "+r+"�� ���� �׸���");
	}
	@Override
	public void erase() { //���� �������̵�
		System.out.println("���� �����");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		//��ü ����
		Circle cir=new Circle(); 
		cir.draw();
		cir.erase();
		
	}

}
*/
//---------------------------------------�Ϲ� Ŭ����
/*
//Ŭ���� ����
class Shape{
	final int r=10;
	public void draw() {}
	public void erase() {}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("�������� "+r+"�� ���� �׸���");
	}
	@Override
	public void erase() {
		System.out.println("���� �����");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		//��ü ����
		Circle cir=new Circle(); 
		cir.draw();
		cir.erase();
		
	}

}
*/