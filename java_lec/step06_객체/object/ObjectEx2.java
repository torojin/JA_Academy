package object;

public class ObjectEx2 {

	//������ ���⼭
	//�� ���� ��ü�� User.java����
	//2���� �޼��带 �������� setUser,getUser
	public static void main(String[] args) {
		//�ʵ�� �޼��尡 �������� ��ü
		//��ü=�Ӽ�+���� �Ӽ��̶� ���� ���� �ϳ��� �־ ��ü�� �� �� �ִ�.
		User ob=new User();//User ��ü ���� / (class Object(��ü) ����)		
		ob.setUser("���޷�", 97,55,79);
		//�Լ��� ������ٰ� �ݵ�� ����ؾ��ϴ� �� �ƴϴ�
		//int a=getTotal();
		//����� �ϱ� ����
		System.out.println(ob.getUser());
		
		//--���
		//�̸��� ���޷��̰�, ������ 231���Դϴ�
		
	}

}
