package instance;

//class ����
//�θ�Ŭ����
class A{}
//�ڽ�Ŭ���� B,C / �θ�Ŭ���� A ���
class B extends A{}
class C extends A{}
class D extends B{}
public class InstanceofEx1 {

	public static void main(String[] args) {
		//Object ����
		A a=new A();
		B b=new B();
		D d=new D();
		
		//���������� �����ϴ� �ν��Ͻ��� ��ü Ÿ���� �˾ƺ��� ���� ������
		System.out.println(b instanceof A);//true / ���������� ��� / �����ϰ� �ִ� b�� �ν��Ͻ� A�� �����ִ°�? 
		System.out.println(a instanceof C);//false
		System.out.println(d instanceof A); //true �����ε��� �ұ��ϰ� �θ�Ŭ������ ��ӵǾ ���
//		System.out.println(b instanceof C); //error / ������ �����̿��� ���谡 ��� ���� / �˻� ���� �� �� ����.
	}

}
